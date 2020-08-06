<?xml version="1.0"?>
<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="ACT">
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="PREAMBLE">
    <xsl:apply-templates />
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
  </xsl:template>

  <xsl:template match="@* | node()">
    <!-- <xsl:copy>
      <xsl:apply-templates select="@* | node()"/>
    </xsl:copy> -->
  </xsl:template>

</xsl:stylesheet>