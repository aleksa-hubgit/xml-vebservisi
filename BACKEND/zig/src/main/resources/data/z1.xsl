<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
                xmlns:zig="http://www.ftn.uns.ac.rs/zig"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>
    <xsl:template match="/">
        <html>
            <head>
                <title>Zig</title>
                <style>
                    * {
                    margin: 0;
                    padding: 0;
                    text-indent: 0;
                    width:70%;
                    }
                    body {
                    font-family: Arial, sans-serif;
                    font-style: normal;
                    text-decoration: none;
                    }

                    p {
                    font-weight: normal;
                    font-size: 10.5pt;
                    margin: 0pt;
                    }
                    h1 {
                    font-size: 15pt;
                    font-weight: bold;

                    }

                    h4 {
                    font-size: 8pt;
                    font-weight: bold;
                    }

                    table{
                    border-collapse:collapse;
                    border:1px solid black;
                    table-layout: fixed;
                    margin-left: 15.15pt;
                    width: 100%;
                    height: auto;
                    border-spacing: 0;
                    }

                    table td{
                    border:1px solid black;
                    border-collapse:collapse;
                    }
                    .basic_paragraph{
                        padding-left: 5pt;
                        text-align: left;
                        font-size: 9pt;
                    }
                    .top_cells{
                        width: 100%;
                        display: table-cell;
                        vertical-align: top;

                    }
                    .center_cells{
                        width: 100%;
                        display: table-cell;
                        vertical-align: center;
                    }
                    .center_paragraphs{
                        font-size: 9pt;
                        text-align: center;
                    }
                    .address_paragraphs{
                        font-size: 9pt;
                        padding-left: 7pt;
                    }
                    .tax_paragraphs{
                        padding-left: 5pt;
                        text-align: center;
                        font-size: 9pt;
                    }
                    .relative_cells{
                        width: 100%;
                        position: relative;
                    }
                    .full_screen{
                        width: 100%;
                    }

                </style>
            </head>

            <body>
                <h1 style="padding-top: 40pt; text-align: center;">
                    ЗАХТЕВ ЗА ПРИЗНАЊЕ ЖИГА
                </h1>
                <h4 style="text-align: center;">
                    Заводy за интелектуалну својину, Кнегиње Љубице 5, 11000 Београд
                </h4>

                <br/>

                <p style="text-align: center; font-size: 9pt; margin-bottom: 3px;">
                    (попунити на рачунару)
                </p>

                <table style="">
                    <tr style="height: 25pt">
                        <td class="full_screen" colspan="3">
                            <p class="basic_paragraph">
                                <b>1. Подносилац пријаве: </b>име и презиме-пословно име, улица и број, поштански број, место,
                                <br/>
                                <span style="padding-left: 10pt">држава пребивалишта/седишта:</span>
                            </p>
                        </td>
                    </tr>
                    <tr style="height: 50pt">
                        <td class="full_screen" colspan="3">
                            <p style="font-size: 8.5pt;  padding-top: 6pt; padding-left: 7pt; line-height: 10pt;">
                                <p style="font-size: 9pt; padding-top: 6pt; padding-left: 7pt;">
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:ime"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:prezime"/>
                                </p>


                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:adresa/zig:ulica"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:adresa/zig:broj"/>


                                </p>
                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:adresa/zig:postanski_broj"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:adresa/zig:mesto"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:adresa/zig:drzava"/>

                                </p>
                            </p>
                        </td>
                    </tr>
                    <tr style="height: 15pt">
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                телефон: <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:kontakt/zig:broj_telefona"/>
                            </p>
                        </td>
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                e-mail: <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:kontakt/zig:e_posta"/>
                            </p>
                        </td>
                        <td colspan="1">
                            <p class="basic_paragraph">
                                <xsl:value-of select="zig:Prijava/zig:Podnosilac_prijave/zig:kontakt/zig:broj_faksa"/>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 25pt">
                        <td class="full_screen" colspan="3">
                            <p class="basic_paragraph">
                                <b>2. Пуномоћник:</b> име и презиме-пословно име, улица и број, поштански број, држава
                                <br/>
                                <span style="padding-left: 10pt">пребивалишта/седишта:</span>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 50pt">
                        <td class="full_screen" colspan="3">
                            <p style="font-size: 8.5pt;  padding-top: 6pt; padding-left: 7pt; line-height: 10pt;">
                                <p style="font-size: 9pt; padding-top: 6pt; padding-left: 7pt;">
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:ime"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:prezime"/>
                                </p>


                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:adresa/zig:ulica"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:adresa/zig:broj"/>


                                </p>
                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:adresa/zig:postanski_broj"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:adresa/zig:mesto"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:adresa/zig:drzava"/>

                                </p>
                            </p>
                        </td>
                    </tr>
                    <tr style="height: 15pt">
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                телефон: <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:kontakt/zig:broj_telefona"/>
                            </p>
                        </td>
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                e-mail: <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:kontakt/zig:e_posta"/>
                            </p>
                        </td>
                        <td colspan="1">
                            <p class="basic_paragraph">
                                <xsl:value-of select="zig:Prijava/zig:Punomocnik/zig:kontakt/zig:broj_faksa"/>
                            </p>
                        </td>
                    </tr>


                    <tr style="height: 15pt">
                        <td class="full_screen" colspan="3">
                            <p class="basic_paragraph">
                                <b>3. Подаци о заједничком представнику ако постоји више подносилаца пријаве</b>
                            </p>
                        </td>
                    </tr>


                    <tr style="height: 50pt">
                        <td class="full_screen" colspan="3">
                            <p style="font-size: 8.5pt;  padding-top: 6pt; padding-left: 7pt; line-height: 10pt;">
                                <p style="font-size: 9pt; padding-top: 6pt; padding-left: 7pt;">
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:ime"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:prezime"/>
                                </p>


                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:adresa/zig:ulica"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:adresa/zig:broj"/>


                                </p>
                                <p class="address_paragraphs">
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:adresa/zig:postanski_broj"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:adresa/zig:mesto"/>&#160;
                                    <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:adresa/zig:drzava"/>

                                </p>
                            </p>
                        </td>
                    </tr>
                    <tr style="height: 15pt">
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                телефон: <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:kontakt/zig:broj_telefona"/>
                            </p>
                        </td>
                        <td  colspan="1">
                            <p class="basic_paragraph">
                                e-mail: <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:kontakt/zig:e_posta"/>
                            </p>
                        </td>
                        <td colspan="1">
                            <p class="basic_paragraph">
                                <xsl:value-of select="zig:Prijava/zig:Zajednicki_predstavnik/zig:kontakt/zig:broj_faksa"/>
                            </p>
                        </td>
                    </tr>


                </table>

                <table style="border-top: 0;">
                    <tr style="height: 15pt; border-top: 0;">
                        <td class="full_screen" colspan="8">
                            <p class="basic_paragraph">
                                <b>4. Пријава се подноси за (уписати X):</b>
                            </p>
                        </td>
                        <td class="relative_cells" rowspan="2" colspan="8">
                            <p style="padding-left: 5pt; text-align: left; vertical-align: bottom; font-size: 9pt">
                                <b>в) изглед знака:</b>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 12pt">
                        <td class="relative_cells" colspan="1" rowspan="3">
                            <p class="basic_paragraph">
                                <b>а)</b>
                            </p>
                        </td>
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                индивидуални жиг
                            </p>
                        </td>
                        <td class="center_cells" colspan="2">
                            <xsl:variable name="tip_ziga" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_ziga"/>
                            <xsl:choose>
                                <xsl:when test="$tip_ziga='INDIVIDUALNI_ZIG'">
                                    <p class="center_paragraphs">
                                        X

                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                колективни жиг
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="tip_ziga" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_ziga"/>
                            <xsl:choose>
                                <xsl:when test="$tip_ziga='KOLEKTIVNI_ZIG'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                        <td class="full_screen" colspan="8" rowspan="16">
                        </td>
                    </tr>

                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                жиг гаранције
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="tip_ziga" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_ziga"/>
                            <xsl:choose>
                                <xsl:when test="$tip_ziga='GARANTNI_ZIG'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 12pt">
                        <td class="relative_cells" colspan="1" rowspan="5">
                            <p class="basic_paragraph" style="vertical-align: center">
                                <b>б)</b>
                            </p>
                        </td>
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                вербални знак (знак у речи)
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="vrsta_znaka" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$vrsta_znaka='VERBALNI_ZNAK'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph" >
                                графички знак, боју, комбинацију <br/>
                                boja
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="vrsta_znaka" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$vrsta_znaka='GRAFICKI_ZNAK'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>


                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                комбиновани знак
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="vrsta_znaka" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$vrsta_znaka='KOMBINOVANI_ZNAK'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>


                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph">
                                тродимензионални знак
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="vrsta_znaka" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$vrsta_znaka='TRODIMENZIONALNI_ZNAK'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>


                    <tr style="height: 12pt">
                        <td class="full_screen" colspan="5">
                            <p class="basic_paragraph" >
                                другу врсту знака (навести коју)
                            </p>
                        </td>
                        <td class="full_screen" colspan="2">
                            <xsl:variable name="vrsta_znaka" select="zig:Prijava/zig:Informacije_o_zigu/zig:Tip_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$vrsta_znaka='DRUGA_VRSTA'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 40pt">
                        <td class="relative_cells" style="display: table-cell; vertical-align: top" colspan="8" rowspan="3">
                            <p class="basic_paragraph" style=" vertical-align: top">
                                <b>5. Назначење боје, односно боја из којих се знак <br/>
                                    састоји:</b>
                            </p>
                            <p class="basic_paragraph" style=" vertical-align: bottom;">
                                <xsl:value-of select="zig:Prijava/zig:Informacije_o_zigu/zig:Boje_znaka/zig:Boja"/>
                            </p>
                        </td>
                    </tr>

                    <tr/>
                    <tr/>

                    <tr style="height: 30pt">
                        <td class="top_cells" colspan="8" rowspan="2">
                            <p class="basic_paragraph" >
                                <b>6. Транслитерација знака*:</b>
                            </p>
                            <p class="basic_paragraph" style=" vertical-align: bottom;">
                                <xsl:value-of select="zig:Prijava/zig:Informacije_o_zigu/zig:Transliteracija_znaka"/>
                            </p>
                        </td>
                    </tr>

                    <tr/>

                    <tr style="height: 30pt">
                        <td class="top_cells" colspan="8" rowspan="2">
                            <p class="basic_paragraph" >
                                <b>7. Превод знака*:</b>
                            </p>
                            <p class="basic_paragraph" style=" vertical-align: bottom;">
                                <xsl:value-of select="zig:Prijava/zig:Informacije_o_zigu/zig:Prevod_znaka"/>
                            </p>
                        </td>
                    </tr>

                    <tr/>

                    <tr style="height: 30pt">
                        <td class="relative_cells" style=" display: table-cell; vertical-align: top" colspan="8" rowspan="2">
                            <p class="basic_paragraph">
                                <b>8. Опис знака*:</b>
                            </p>
                            <p class="basic_paragraph" style="vertical-align: bottom;">
                                <xsl:value-of select="zig:Prijava/zig:Informacije_o_zigu/zig:Opis_znaka"/>
                            </p>
                        </td>
                    </tr>

                    <tr/>

                </table>

                <table>
                    <tr style="height: 15pt">
                        <td class="relative_cells" style="display: table-cell; vertical-align: top" colspan="23">
                            <p class="basic_paragraph">
                                <b>9. Заокружити бројеве класа робе и услуга према Ничанској класификацији:</b>
                            </p>
                        </td>
                    </tr>


                    <tr>
                        <xsl:variable name="klase" select="zig:Prijava/zig:Informacije_o_zigu/zig:Nicanska_klasifikacija"/>

                        <xsl:for-each select="//*[position() &gt;= 1 and position() &lt;= 23]">
                            <xsl:choose>
                                <xsl:when test="position() = $klase">
                                    <td style="background-color: red; padding-left: 2pt; text-align: left; font-size: 7pt;">
                                        <xsl:value-of select="position()"/>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td style="padding-left: 2pt; text-align: left; font-size: 7pt;">
                                        <xsl:value-of select="position()"/>
                                    </td>
                                </xsl:otherwise>
                            </xsl:choose>
                        </xsl:for-each>
                    </tr>

                    <tr>
                        <xsl:variable name="klase" select="zig:Prijava/zig:Informacije_o_zigu/zig:Nicanska_klasifikacija"/>
                        <xsl:for-each select="//*[position() &gt;= 24 and position() &lt;= 45]">
                            <xsl:choose>
                                <xsl:when test="position()+23 = $klase">
                                    <td style="background-color: red; padding-left: 2pt; text-align: left; font-size: 7pt;">
                                        <xsl:value-of select="position()+23"/>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td style="padding-left: 2pt; text-align: left; font-size: 7pt;"><xsl:value-of select="position()+23"/></td>
                                </xsl:otherwise>
                            </xsl:choose>
                        </xsl:for-each>

                        <td/>
                    </tr>

                    <tr style="height: 40px">
                        <td class="relative_cells" style="display: table-cell; vertical-align: top; margin-top:0;" colspan="23" rowspan="2">
                            <p class="basic_paragraph">
                                <b>10. Затражено право првенства и основ:</b>
                            </p>
                        </td>
                    </tr>

                    <tr/>
                </table>

                <p style="text-align: center; font-size: 9pt; padding-top: 10px; padding-bottom: 50px;">
                    *Попунити само ако је знак или елемент знака исписан словима која нису ћирилична или латинична
                </p>

                <table style="padding-bottom: 100px; margin-top: 50px; ">
                    <tr style="height: 25pt">
                        <td class="top_cells" colspan="3">
                            <p class="basic_paragraph">
                                <b>11. Плаћене таксе:</b>
                            </p>
                        </td>

                        <td class="top_cells" colspan="1">
                            <p class="basic_paragraph">
                                <b>Динара</b>
                            </p>
                        </td>

                        <td class="top_cells" colspan="3" rowspan="4">
                            <p class="tax_paragraphs">
                                <b>Потпис подносиоца захтева</b>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 25pt">
                        <td class="center_cells"  colspan="3">
                            <p class="basic_paragraph">
                                <b>а) основна такса</b>
                            </p>
                        </td>

                        <td class="full_screen" colspan="1">
                            <p class="tax_paragraphs">
                                <xsl:value-of select="zig:Prijava/zig:Takse/zig:Osnovna_taksa"/>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 50pt">
                        <td class="center_cells"  colspan="3">
                            <p class="basic_paragraph">
                                <b>б) за <xsl:value-of select="zig:Prijava/zig:Takse/zig:Klasna_taksa/zig:Broj_klasa"/> класа</b> <br/>
                                <b>б) за  графичко решење</b>
                            </p>
                        </td>

                        <td class="full_screen" colspan="1">
                            <p class="tax_paragraphs">
                                <xsl:value-of select="zig:Prijava/zig:Takse/zig:Klasna_taksa/zig:Iznos"/>

                            </p>
                        </td>

                    </tr>

                    <tr style="height: 25pt">
                        <td class="center_cells" colspan="3">
                            <p class="basic_paragraph" >
                                <b>УКУПНО</b>
                            </p>
                        </td>

                        <td class="full_screen" colspan="1">
                            <p class="tax_paragraphs">
                                <xsl:value-of select="zig:Prijava/zig:Takse/zig:Ukupna_taksa"/>
                            </p>
                        </td>
                    </tr>
                </table>

                <table style="padding-top: 100px; margin-top: 50px; margin-bottom: 100px">
                    <tr style="height: 20pt">
                        <td style="width: 100%; display: table-cell; vertical-align: bottom" colspan="11">
                            <p style="padding-left: 5pt; text-align: center; font-size: 10pt">
                                <b>ПОПУЊАВА ЗАВОД</b>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="6">
                            <p class="basic_paragraph">
                                <b>Прилози уз захтев: </b>
                            </p>
                        </td>

                        <td class="center_cells" colspan="5" rowspan="9">
                            <p class="tax_paragraphs">
                                Број пријаве жига: <br/><br/>
                                Ж-<xsl:value-of select="zig:Prijava/zig:Informacija_zavoda/zig:Broj_prijave"/><br/>
                                <b>Датум подношења: </b> <br/><br/>
                                <xsl:value-of select="zig:Prijava/zig:Informacija_zavoda/zig:Datum_podnosenja"/>
                            </p>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Примерак знака
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="primerak" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Primerak_znaka"/>
                            <xsl:choose>
                                <xsl:when test="$primerak = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Списак робе и услуга**
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="spisak_robe_i_usluga" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Spisak_robe_i_usluga"/>
                            <xsl:choose>
                                <xsl:when test="$spisak_robe_i_usluga = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Пуномоћје
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="punomocje" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Punomocje"/>
                            <xsl:choose>
                                <xsl:when test="$punomocje = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>


                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Генерално пуномоћје раније приложено
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="ranije_punomocje" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Generalno_punomocje"/>
                            <xsl:choose>
                                <xsl:when test="$ranije_punomocje = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Пуномоћје ће бити накнадно достављено
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="naknadno_punomocje" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Naknadno_dostavljeno_punomocje"/>
                            <xsl:choose>
                                <xsl:when test="$naknadno_punomocje = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Општи акт о колективном жигу/жигу гаранције
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="opsti_akt" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Opsti_akt"/>
                            <xsl:choose>
                                <xsl:when test="$opsti_akt = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Доказ о праву првенства
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="pravo_prvenstva" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Dokaz_o_pravu_prvenstva"/>
                            <xsl:choose>
                                <xsl:when test="$pravo_prvenstva = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                    <tr style="height: 20pt">
                        <td class="top_cells" colspan="5">
                            <p class="basic_paragraph">
                                Доказ о уплати таксе
                            </p>
                        </td>

                        <td class="center_cells"  colspan="1">
                            <xsl:variable name="dokaz_o_uplati_takse" select="zig:Prijava/zig:Informacija_zavoda/zig:Prilozi/zig:Dokaz_o_uplati_takse"/>
                            <xsl:choose>
                                <xsl:when test="$dokaz_o_uplati_takse = 'true'">
                                    <p class="center_paragraphs">
                                        X
                                    </p>
                                </xsl:when>
                            </xsl:choose>
                        </td>
                    </tr>

                </table>

                <div style="display: block; justify-content: center; text-align: justify">
                    <p style="font-size: 9pt; display: block; margin-left: 15.15pt;">
                        **Уз заокруживање броја класе робе/услуга Ничанске класификације у рубрици 9 доставља се и списак који
                        садржи конкретне називе робе коју подносилац пријаве производи, односно услуга које пружа. У циљу
                        одређења обима заштите која се стиче жигом, списак треба да садржи јасне и прецизне називе робе и
                        услуга. У ту сврху могу се користити појмови из детаљне Листе роба и услуга или MGS Manager апликације,
                        доступних на сајту Завода. Уколико се у списак уносе термини из Листе класа Ничанске класификације,
                        заштита обухвата само тако именоване, конкретне робе/услуге у њиховом јасном и недвосмисленом
                        значењу.
                    </p>
                </div>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>