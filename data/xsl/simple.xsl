<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">

		<html>
			<head>
				<title>Simple XSL</title>
			</head>

			<body>
				<table border="1">
					<tr>
						<th>name</th>
						<th>isMale</th>
						<th>birthday</th>
						<th>emailAddresses</th>
						<th>phoneNumbers</th>
						<th>creditCard</th>
						<th>occupationTitle</th>
						<th>departmentTitle</th>
						<th>hireDate</th>
						<th>hourRate</th>
						<th>vacation</th>
						<th>holiday</th>
						<th>std</th>
						<th>ltd</th>
						<th>modifiedDate</th>
					</tr>
					<xsl:for-each select="humanResources/Employee">
						<tr>
							<td>
								<xsl:value-of select="person/name" />
							</td>
							<td>
								<xsl:value-of select="person/isMale" />
							</td>
							<td>
								<xsl:value-of select="person/birthday" />
							</td>
							<td>
								<xsl:value-of select="person/iCi/emailAddresses" />
							</td>
							<td>
								<xsl:value-of select="person/iCi/phoneNumbers" />
							</td>
							<td>
								<xsl:value-of select="data/creditCard" />
							</td>
							<td>
								<xsl:value-of select="data/occupationTitle" />
							</td>
							<td>
								<xsl:value-of select="data/departmentTitle" />
							</td>
							<td>
								<xsl:value-of select="data/hireDate" />
							</td>
							<td>
								<xsl:value-of select="data/hourRate" />
							</td>
							<td>
								<xsl:value-of select="data/vacation" />
							</td>
							<td>
								<xsl:value-of select="data/holiday" />
							</td>
							<td>
								<xsl:value-of select="data/std" />
							</td>
							<td>
								<xsl:value-of select="data/ltd" />
							</td>
							<td>
								<xsl:value-of select="modifiedDate" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>

		</html>

	</xsl:template>
</xsl:stylesheet>