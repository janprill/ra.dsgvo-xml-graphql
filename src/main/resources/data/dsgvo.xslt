<?xml version="1.0"?>
<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


  <xsl:output method="xml" indent="yes"/>
  <xsl:strip-space elements="*"/>


  <xsl:template match="ACT">
    <root>
      <xsl:apply-templates />
    </root>
  </xsl:template>

  <xsl:template match="PREAMBLE">
    <preamble>
      <xsl:apply-templates />
    </preamble>
  </xsl:template>

  <xsl:template match="GR.CONSID">
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="CONSID">
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="NP">
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="NO.P">
    <number>
      <xsl:value-of select="text()" />
    </number>
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="TXT">
    <TXT>
      <xsl:copy>
        <xsl:apply-templates select="@* | node()"/>
      </xsl:copy>
    </TXT>
  </xsl:template>

  <xsl:template match="NOTE">
    <note>
      <xsl:apply-templates />
    </note>
  </xsl:template>

  <xsl:template match="P">
    <p>
      <xsl:apply-templates />
    </p>
  </xsl:template>

  <xsl:template match="text()">
    <text>
      <xsl:value-of select="."/>
    </text>
  </xsl:template>

  <xsl:template match="@* | node()">
    <xsl:value-of select="./text()" />
    <!--
    <xsl:copy>
      <xsl:apply-templates select="@* | node()"/>
    </xsl:copy>
    -->
  </xsl:template>

</xsl:stylesheet>