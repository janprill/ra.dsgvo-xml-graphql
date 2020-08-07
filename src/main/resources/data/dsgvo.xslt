<?xml version="1.0"?>
<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


  <xsl:output method="xml" indent="yes"/>
  <xsl:strip-space elements="*"/>

  <xsl:template match="/">
    <dsgvo>
      <preamble>
        <xsl:apply-templates select="//PREAMBLE" />
      </preamble>
      <terms>
        <xsl:apply-templates select="//ENACTING.TERMS"/>
      </terms>
    </dsgvo>
  </xsl:template>

  <xsl:template match="@* | node()">
    <xsl:copy>
      <xsl:apply-templates select="@* | node()"/>
    </xsl:copy>
  </xsl:template>

  <!-- preamble -->
  <xsl:template match="PREAMBLE">
    <xsl:apply-templates select="//CONSID" />
  </xsl:template>

  <xsl:template match="CONSID">
    <xsl:apply-templates select="NP"/>
  </xsl:template>

  <xsl:template match="NP">
    <consideration>
      <id>
        <xsl:value-of select="NO.P" />
      </id>
    </consideration>
  </xsl:template>

  <!-- in enacting terms -->

  <xsl:template match="DIVISION">
    <division>
      <xsl:apply-templates/>
    </division>
  </xsl:template>

  <xsl:template match="ARTICLE">
    <article>
      <id><xsl:value-of select="./@IDENTIFIER"/></id>
      <title><xsl:value-of select="./TI.ART"/></title>
      <subtitle><xsl:value-of select="./STI.ART"/></subtitle>
    </article>
  </xsl:template>

</xsl:stylesheet>