<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>

				<h2>Order Details</h2>
				<h3>
					<xsl:value-of select="Order/CustomerName" />
				</h3>
				<h3>
					<xsl:value-of select="Order/@id" />
				</h3>
				<table border="1">
					<tr bgcolor="blue">
						<th>ItemId</th>
						<th>ItemName</th>
						<th>Price</th>
						<th>Quantity</th>
					</tr>
					<xsl:for-each select="Order/Item">
						<tr>
							<td>
								<xsl:value-of select="ItemId"></xsl:value-of>
							</td>
							<td>
								<xsl:value-of select="ItemName"></xsl:value-of>
							</td>
							<td>
								<xsl:value-of select="Price"></xsl:value-of>
							</td>

							<td>
								<xsl:value-of select="Quantity"></xsl:value-of>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>

		</html>
	</xsl:template>
</xsl:stylesheet>