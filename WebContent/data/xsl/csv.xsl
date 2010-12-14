<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text" />
	

		
	<xsl:template match="humanResources">
		<xsl:text>name,isMale,birthday,emailAddresses,phoneNumbers,</xsl:text>
		<xsl:text>creditCard,occupationTitle,departmentTitle,hireDate,hourRate,</xsl:text>
		<xsl:text>vacation,holiday,std,ltd,modifiedDate</xsl:text><xsl:text>&#10;</xsl:text>
		<xsl:apply-templates select="Employee" />
	</xsl:template>
	<xsl:template match="Employee">
		<xsl:apply-templates select="person" />
		<xsl:text>,</xsl:text>
		<xsl:apply-templates select="data" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="modifiedDate" />
		<xsl:text>&#10;</xsl:text>
	</xsl:template>
	<xsl:template match="person">
		<xsl:value-of select="name" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="isMale" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="birthday" />
		<xsl:text>,</xsl:text>
		<xsl:apply-templates select="iCi" />
	</xsl:template>
	<xsl:template match="iCi">
		<xsl:for-each select="emailAddresses">
			<xsl:value-of select="." />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
		<xsl:text>,</xsl:text>
		<xsl:for-each select="phoneNumbers">
			<xsl:value-of select="." />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
	<xsl:template match="data">
		<xsl:value-of select="creditCard" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="occupationTitle" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="departmentTitle" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="hireDate" />
		<xsl:text>,</xsl:text>
		<xsl:value-of select="hourRate" />
		<xsl:text>,</xsl:text>
		<xsl:for-each select="vacation">
			<xsl:value-of select="start" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="end" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="compensated" />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
		<xsl:text>,</xsl:text>
		<xsl:for-each select="holiday">
			<xsl:value-of select="start" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="end" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="compensated" />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
		<xsl:text>,</xsl:text>
		<xsl:for-each select="std">
			<xsl:value-of select="start" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="end" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="compensated" />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
		<xsl:text>,</xsl:text>
		<xsl:for-each select="ltd">
			<xsl:value-of select="start" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="end" />
			<xsl:text>;</xsl:text>
			<xsl:value-of select="compensated" />
			<xsl:if test="position() != last()">
				<xsl:text>|</xsl:text>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
