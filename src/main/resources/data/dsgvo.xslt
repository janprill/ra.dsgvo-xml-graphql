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

  <xsl:template match="TITLE">
     <xsl:apply-templates select="TI|STI" />
  </xsl:template>

  <xsl:template match="TI">
    <title>
      <xsl:apply-templates/>
    </title>
  </xsl:template>

  <xsl:template match="STI">
    <subtitle>
      <xsl:apply-templates/>
    </subtitle>
  </xsl:template>

  <xsl:template match="HT">
    <highlight>
      <type><xsl:value-of select="@TYPE"/></type>
      <text><xsl:value-of select="text()"/></text>
      <xsl:apply-templates/>
    </highlight>
  </xsl:template>

  <xsl:template match="ENACTING.TERMS">
    <xsl:apply-templates select="//DIVISION" />
  </xsl:template>

  <xsl:template match="CONSID">
    <xsl:apply-templates select="NP"/>
  </xsl:template>

  <xsl:template match="NP">
    <xsl:choose>
      <xsl:when test="./parent::ITEM">
        <li>
          <id>
            <xsl:value-of select="NO.P" />
          </id>
          <xsl:apply-templates select="TXT|P" />
        </li>
      </xsl:when>
      <xsl:otherwise>
        <np>
          <id>
            <xsl:value-of select="NO.P" />
          </id>
          <xsl:apply-templates select="TXT|P" />
        </np>
      </xsl:otherwise>
    </xsl:choose>
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
      <xsl:apply-templates select="PARAG" />
    </article>
  </xsl:template>

  <xsl:template match="PARAG">
    <paragraph>
      <id><xsl:value-of select="./@IDENTIFIER" /></id>
      <no><xsl:value-of select="NO.PARAG"/></no>
      <xsl:apply-templates select="ALINEA" />
    </paragraph>
  </xsl:template>

  <xsl:template match="ALINEA">
    <alinea>
      <xsl:apply-templates/>
    </alinea>
  </xsl:template>

  <xsl:template match="TXT">
    <txt>
      <xsl:apply-templates />
    </txt>
  </xsl:template>

  <xsl:template match="P">
    <xsl:choose>
      <xsl:when test="./parent::ITEM">
        <li>
          <txt>
            <xsl:apply-templates />
          </txt>
        </li>
      </xsl:when>
      <xsl:otherwise>
        <p>
          <xsl:apply-templates />
        </p>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="NOTE">
    <note>
      <id><xsl:value-of select="@NOTE.ID"/></id>
      <type><xsl:value-of select="@TYPE"/></type>
      <xsl:apply-templates />
    </note>
  </xsl:template>

  <xsl:template match="REF.DOC.OJ">
    <reference>
      <coll><xsl:value-of select="@COLL"/></coll>
      <pub><xsl:value-of select="@DATE.PUB"/></pub>
      <no><xsl:value-of select="@NO.OJ"/></no>
      <page><xsl:value-of select="@PAGE.FIRST"/></page>
      <text><xsl:value-of select="text()"/></text>
    </reference>
  </xsl:template>

  <xsl:template match="LIST">
    <list>
      <xsl:apply-templates select="ITEM/P|ITEM/NP"/>
    </list>
  </xsl:template>

  <xsl:template match="DATE">
    <date>
      <iso><xsl:value-of select="@ISO"/></iso>
      <datestr><xsl:value-of select="text()"/></datestr>
    </date>
  </xsl:template>

  <xsl:template match="QUOT.START">
    <quote>
      <start />
      <id><xsl:value-of select="@ID"/></id>
    </quote>
  </xsl:template>

  <xsl:template match="QUOT.END">
    <quote>
      <end />
      <id><xsl:value-of select="@ID"/></id>
    </quote>
  </xsl:template>

</xsl:stylesheet>