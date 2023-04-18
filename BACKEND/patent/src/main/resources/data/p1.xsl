<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
                xmlns:zig="http://www.ftn.uns.ac.rs/patent"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>
    <xsl:template match="/">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="sr" lang="sr">
  <head>
    <title>Patent (XSLT)</title>
    <style type="text/css">
      * {
        margin: 0;
        padding: 0;
        text-indent: 0;
      }
      .s1 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8pt;
      }
      .s2 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8.5pt;
      }
      .s3 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 16pt;
      }
      p {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
        margin: 0pt;
      }
      h1 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: bold;
        text-decoration: none;
        font-size: 12pt;
      }
      .s4 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8pt;
      }
      .s5 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: bold;
        text-decoration: none;
        font-size: 8.5pt;
      }
      .s6 {
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      .s7 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8.5pt;
        vertical-align: 1pt;
      }
      .s8 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8pt;
      }
      .s9 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8.5pt;
        vertical-align: 6pt;
      }
      .s10 {
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8.5pt;
        vertical-align: -5pt;
      }
      li {
        display: block;
      }
      #l1 {
        padding-left: 0pt;
      }
      #l1 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      li {
        display: block;
      }
      #l2 {
        padding-left: 0pt;
      }
      #l2 > li > *:first-child:before {
        content: "* ";
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8pt;
      }
      #l3 {
        padding-left: 0pt;
      }
      #l3 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      li {
        display: block;
      }
      #l4 {
        padding-left: 0pt;
      }
      #l4 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      li {
        display: block;
      }
      #l5 {
        padding-left: 0pt;
      }
      #l5 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      li {
        display: block;
      }
      #l6 {
        padding-left: 0pt;
      }
      #l6 > li > *:first-child:before {
        content: "* ";
        color: black;
        font-family: Arial, sans-serif;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 8pt;
      }
      li {
        display: block;
      }
      #l7 {
        padding-left: 0pt;
      }
      #l7 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      li {
        display: block;
      }
      #l8 {
        padding-left: 0pt;
      }
      #l8 > li > *:first-child:before {
        content: "☐ ";
        color: black;
        font-family: "MS Gothic", monospace;
        font-style: normal;
        font-weight: normal;
        text-decoration: none;
        font-size: 10.5pt;
      }
      table,
      tbody {
        vertical-align: top;
        overflow: visible;
      }
    </style>
  </head>
  <body>
    <p style="text-indent: 0pt; text-align: left"><br /></p>
    <table
      style="border-collapse: collapse; margin-left: 5.5pt"
      cellspacing="0"
    >
      <tr style="height: 11pt">
        <td
          style="
            width: 326pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="4"
        >
          <p
            class="s1"
            style="
              padding-left: 130pt;
              padding-right: 129pt;
              text-indent: 0pt;
              text-align: center;
            "
          >
            Попуњава Завод
          </p>
        </td>
      </tr>
      <tr style="height: 39pt">
        <td
          style="
            width: 74pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 8pt; text-indent: 0pt; text-align: left"
          >
            Број пријаве
          </p>
        </td>
        <td
          style="
            width: 88pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
          "
        >
          <p
            class="s3"
            style="
              padding-top: 8pt;
              padding-left: 16pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            П
          </p>
        </td>
        <td
          style="
            width: 82pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
        <td
          style="
            width: 82pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 10pt; text-indent: 0pt; text-align: left"
          >
            (21)
          </p>
        </td>
      </tr>
      <tr style="height: 39pt">
        <td
          style="
            width: 162pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="2"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 8pt; text-indent: 0pt; text-align: left"
          >
            Датум пријема
          </p>
        </td>
        <td
          style="
            width: 82pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 8pt; text-indent: 0pt; text-align: left"
          >
            Признати датум подношења
          </p>
        </td>
        <td
          style="
            width: 82pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 10pt; text-indent: 0pt; text-align: left"
          >
            (22)
          </p>
        </td>
      </tr>
      <tr style="height: 38pt">
        <td
          style="
            width: 326pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="4"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 8pt; text-indent: 0pt; text-align: left"
          >
            Печат и потпис
          </p>
        </td>
      </tr>
    </table>
    <p
      style="
        padding-top: 2pt;
        padding-left: 26pt;
        text-indent: 0pt;
        line-height: 12pt;
        text-align: left;
      "
    >
      Република Србија
    </p>
    <p
      style="
        padding-left: 26pt;
        text-indent: 0pt;
        line-height: 92%;
        text-align: left;
      "
    >
      Завод за интелектуалну својину Кнегиње Љубице број 5
    </p>
    <p
      style="
        padding-left: 26pt;
        text-indent: 0pt;
        line-height: 11pt;
        text-align: left;
      "
    >
      11000 Београд
    </p>
    <p style="text-indent: 0pt; text-align: left"><br /></p>
    <h1
      style="
        padding-top: 4pt;
        padding-left: 180pt;
        text-indent: 0pt;
        text-align: center;
      "
    >
      <a name="bookmark0">ЗАХТЕВ</a>
    </h1>
    <h1
      style="
        padding-top: 8pt;
        padding-left: 180pt;
        text-indent: 0pt;
        text-align: center;
      "
    >
      <a name="bookmark1">ЗА ПРИЗНАЊЕ ПАТЕНТА</a>
    </h1>
    <p style="text-indent: 0pt; text-align: left"><br /></p>
    <p
      class="s4"
      style="padding-left: 180pt; text-indent: 0pt; text-align: center"
    >
      (попунити писаћом машином или рачунаром)
    </p>
    <p style="text-indent: 0pt; text-align: left"><br /></p>
    <table
      style="border-collapse: collapse; margin-left: 5.5pt"
      cellspacing="0"
    >
      <tr style="height: 54pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Поље број I НАЗИВ ПРОНАЛАСКА (54)
          </p>
          <p
            class="s1"
            style="
              padding-top: 3pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            * Назив проналаска треба да јасно и сажето изражава суштину
            проналаска и не сме да садржи измишљене или комерцијалне називе,
            жигове, имена, шифре, уобичајене скраћенице за производе и сл.
          </p>
        </td>
      </tr>
      <tr style="height: 37pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s2"
            style="
              padding-top: 3pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            На српском језику:
          </p>
          <p
            class="s2"
            style="
              padding-top: 8pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            На српском језику:
          </p>
        </td>
      </tr>
      <tr style="height: 25pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s5"
            style="
              padding-top: 5pt;
              padding-left: 1pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Поље број II ПОДНОСИЛАЦ ПРИЈАВЕ <span class="s6">☐ </span>Подносилац
            пријаве је и проналазач <span class="s7">(71)</span>
          </p>
        </td>
      </tr>
      <tr style="height: 53pt">
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="2"
        >
          <p
            class="s2"
            style="
              padding-top: 1pt;
              padding-left: 8pt;
              text-indent: 0pt;
              line-height: 10pt;
              text-align: left;
            "
          >
            Име и презиме / Пословно име: <span class="s8">(презиме</span>
          </p>
          <p
            class="s1"
            style="
              padding-left: 8pt;
              text-indent: 0pt;
              line-height: 9pt;
              text-align: left;
            "
          >
            / пословно име уписати великим словима)
          </p>
        </td>
        <td
          style="
            width: 176pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="2"
        >
          <p
            class="s2"
            style="
              padding-top: 1pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Улица и број, поштански број, место и држава:
          </p>
        </td>
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 2pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Број телефона:
          </p>
        </td>
      </tr>
      <tr style="height: 44pt">
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 1pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Број факса:
          </p>
        </td>
      </tr>
      <tr style="height: 39pt">
        <td
          style="
            width: 349pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="2"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Држављанство:
            <span class="s8">(попунити само за физичка лица)</span>
          </p>
        </td>
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 6pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Е-пошта:
          </p>
        </td>
      </tr>
      <tr style="height: 60pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <ul id="l1">
            <li data-list-text="☐">
              <p
                class="s5"
                style="
                  padding-top: 6pt;
                  padding-left: 23pt;
                  text-indent: -15pt;
                  text-align: left;
                "
              >
                Остали подносиоци пријаве су наведени у додатном листу 1 у
                наставку овог захтева
              </p>
            </li>
          </ul>
          <p
            class="s1"
            style="
              padding-top: 3pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            * Ако више лица подноси пријаву, потребно је одредити једно од тих
            лица као заједничког представника и доставити изјаву о зај едничком
            представнику потписaну од стране свих подносилаца или именовати
            заједничког пуномоћника за заступање и доставити пуномоћје
          </p>
        </td>
      </tr>
    </table>
    <table
      style="border-collapse: collapse; margin-left: 5.5pt"
      cellspacing="0"
    >
      <tr style="height: 91pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s5"
            style="
              padding-top: 5pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Поље број III ПРОНАЛАЗАЧ (72)
          </p>
          <p
            class="s1"
            style="
              padding-top: 2pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            (ако су сви проналазачи уједно и подносиоци пријаве, поље број III
            се не попуњава)
          </p>
          <ul id="l2">
            <li data-list-text="*">
              <p
                class="s1"
                style="
                  padding-top: 3pt;
                  padding-left: 6pt;
                  padding-right: 12pt;
                  text-indent: 5pt;
                  text-align: left;
                "
              >
                Ако сви подносиоци пријаве нису и проналазачи, доставља се
                изјава подносилаца пријаве о основу стицања права на подношење
                пријаве у односу на проналазаче који нису и подносиоци пријаве и
                у том случају у поље број III се уносе подаци о свим
                проналазачим
              </p>
              <ul id="l3">
                <li data-list-text="☐">
                  <p
                    class="s2"
                    style="
                      padding-left: 311pt;
                      text-indent: -15pt;
                      line-height: 13pt;
                      text-align: left;
                    "
                  >
                    Проналазач не жели да буде наведен у пријави
                  </p>
                </li>
              </ul>
            </li>
          </ul>
          <p
            class="s1"
            style="
              padding-left: 6pt;
              text-indent: 0pt;
              line-height: 8pt;
              text-align: left;
            "
          >
            (ако проналазач не жели да буде наведен у пријави поље број III се
            не попуњава)
          </p>
          <p
            class="s2"
            style="
              padding-top: 3pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            *
            <span class="s8"
              >Ако проналазач не жели да буде наведен у пријави, потребно је
              доставити потписану изјаву проналазача да не жели да буде навед
              ен.</span
            >
          </p>
        </td>
      </tr>
      <tr style="height: 35pt">
        <td
          style="
            width: 183pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="3"
        >
          <p
            class="s2"
            style="
              padding-top: 5pt;
              padding-left: 8pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Име и презиме:
            <span class="s8">(презиме уписати великим словима)</span>
          </p>
        </td>
        <td
          style="
            width: 182pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="3"
        >
          <p
            class="s2"
            style="
              padding-top: 5pt;
              padding-left: 8pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Улица и број, поштански број, место и држава:
          </p>
        </td>
        <td
          style="
            width: 157pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Број телефона:
          </p>
        </td>
      </tr>
      <tr style="height: 33pt">
        <td
          style="
            width: 157pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-left: 6pt;
              text-indent: 0pt;
              line-height: 10pt;
              text-align: left;
            "
          >
            Број факса:
          </p>
        </td>
      </tr>
      <tr style="height: 37pt">
        <td
          style="
            width: 157pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 1pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Е-пошта:
          </p>
        </td>
      </tr>
      <tr style="height: 43pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <ul id="l4">
            <li data-list-text="☐">
              <p
                class="s5"
                style="padding-left: 23pt; text-indent: -15pt; text-align: left"
              >
                Остали проналазачи су наведени у додатном листу 1 у наставку
                овог захтева
              </p>
            </li>
          </ul>
        </td>
      </tr>
    </table>
    <p style="text-indent: 0pt; text-align: left"><br /></p>
    <table
      style="border-collapse: collapse; margin-left: 5.5pt"
      cellspacing="0"
    >
      <tr style="height: 102pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s5"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Поље број IV <span class="s6">☐ </span>ПУНОМОЋНИК ЗА ЗАСТУПАЊЕ
            <span class="s6">☐ </span>ПУНОМОЋНИК ЗА ПРИЈЕМ ПИСМЕНА (74)
          </p>
          <ul id="l5">
            <li data-list-text="☐">
              <p
                class="s5"
                style="
                  padding-top: 1pt;
                  padding-left: 105pt;
                  text-indent: -15pt;
                  line-height: 13pt;
                  text-align: left;
                "
              >
                ЗАЈЕДНИЧКИ ПРЕДСТАВНИК
              </p>
            </li>
          </ul>
          <ul id="l6">
            <li data-list-text="*">
              <p
                class="s1"
                style="
                  padding-left: 12pt;
                  padding-right: 36pt;
                  text-indent: -5pt;
                  text-align: left;
                "
              >
                Пуномоћник за заступање је лице које по овлашћењу подносиоца
                пријаве предузима радње у управном поступку у границама
                пуномоћја
              </p>
            </li>
            <li data-list-text="*">
              <p
                class="s1"
                style="
                  padding-top: 2pt;
                  padding-left: 6pt;
                  padding-right: 36pt;
                  text-indent: 0pt;
                  text-align: left;
                "
              >
                Пуномоћник за пријем писмена је лице које је подносилац пријаве
                одредио као лице коме се упућују сва писмена насловљена на
                подносиоца
              </p>
            </li>
            <li data-list-text="*">
              <p
                class="s1"
                style="
                  padding-top: 2pt;
                  padding-left: 6pt;
                  padding-right: 31pt;
                  text-indent: 0pt;
                  text-align: left;
                "
              >
                Заједничи преставник је подносилац пријаве кога су подносиоци
                пријаве, у случају да пријаву подноси више лица, одредили да
                иступа у поступку пред органом ако подносиоци нису именовали
                заједничког пуномоћника за заступање
              </p>
            </li>
          </ul>
        </td>
      </tr>
      <tr style="height: 43pt">
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="2"
        >
          <p
            class="s2"
            style="
              padding-top: 3pt;
              padding-left: 8pt;
              padding-right: 39pt;
              text-indent: 0pt;
              text-align: justify;
            "
          >
            Име и презиме / Пословно име<span class="s8"
              >: (презиме / пословно име уписати великим словима)</span
            >
          </p>
        </td>
        <td
          style="
            width: 176pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          rowspan="2"
        >
          <p
            class="s2"
            style="
              padding-top: 1pt;
              padding-left: 8pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Улица и број, поштански број и место:
          </p>
        </td>
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Број телефона:
          </p>
        </td>
      </tr>
      <tr style="height: 31pt">
        <td
          style="
            width: 173pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 2pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Е-пошта:
          </p>
        </td>
      </tr>
      <tr style="height: 51pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Поље број V АДРЕСА ЗА ДОСТАВЉАЊЕ
          </p>
          <p
            class="s1"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            (ово поље се попуњава ако подносилац пријаве, заједнички представник
            или пуномоћник жели да се достављање поднесака врши на другој адреси
            од његове наведене адресе)
          </p>
        </td>
      </tr>
      <tr style="height: 28pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Улица и број, поштански број и место:
          </p>
        </td>
      </tr>
      <tr style="height: 31pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="padding-left: 6pt; text-indent: 0pt; text-align: left"
          >
            Поље број VI НАЧИН ДОСТАВЉАЊА
          </p>
        </td>
      </tr>
      <tr style="height: 57pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <ul id="l7">
            <li data-list-text="☐">
              <p
                class="s2"
                style="
                  padding-left: 7pt;
                  padding-right: 55pt;
                  text-indent: 0pt;
                  line-height: 93%;
                  text-align: left;
                "
              >
                Подносилац пријаве је сагласан да Завод врши достављање писмена
                искључиво електронским путем у форми електронског документа
                <span class="s8"
                  >(у овом случају неопходна је регистрација на порталу
                  „еУправе”)</span
                >
              </p>
            </li>
            <li data-list-text="☐">
              <p
                class="s2"
                style="
                  padding-top: 2pt;
                  padding-left: 23pt;
                  text-indent: -15pt;
                  text-align: left;
                "
              >
                Подносилац пријаве је сагласан да Завод врши достављање писмена
                у папирној форми
              </p>
            </li>
          </ul>
        </td>
      </tr>
      <tr style="height: 31pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="
              padding-left: 488pt;
              padding-right: 14pt;
              text-indent: -482pt;
              line-height: 28%;
              text-align: left;
            "
          >
            Поље број VII <span class="s6">☐ </span>ДОПУНСКА ПРИЈАВА
            <span class="s6">☐ </span>ИЗДВОЈЕНА ПРИЈАВА
            <span class="s9">(61)/( </span><span class="s2">62)</span>
          </p>
        </td>
      </tr>
      <tr style="height: 23pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s2"
            style="
              padding-top: 5pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Број првобитне пријаве / основне пријаве, односно основног патента:
          </p>
        </td>
      </tr>
      <tr style="height: 21pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s2"
            style="
              padding-top: 4pt;
              padding-left: 6pt;
              text-indent: 0pt;
              text-align: left;
            "
          >
            Датум подношења првобитнe пријаве / основне пријаве:
          </p>
        </td>
      </tr>
      <tr style="height: 23pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="3"
        >
          <p
            class="s5"
            style="
              padding-top: 1pt;
              padding-left: 6pt;
              text-indent: 0pt;
              line-height: 66%;
              text-align: left;
            "
          >
            Поље број VIII ЗАХТЕВ ЗА ПРИЗНАЊЕ ПРАВА ПРВЕНСТ ВА ИЗ РАНИЈИХ
            <span class="s10">(30)</span>
          </p>
          <p
            class="s5"
            style="
              padding-left: 6pt;
              text-indent: 0pt;
              line-height: 8pt;
              text-align: left;
            "
          >
            ПРИЈАВА:
          </p>
        </td>
      </tr>
    </table>
    <table
      style="border-collapse: collapse; margin-left: 5.5pt"
      cellspacing="0"
    >
      <tr style="height: 41pt">
        <td
          style="
            width: 177pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="2"
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 21pt; text-indent: 0pt; text-align: left"
          >
            Датум подношења раније пријаве
          </p>
        </td>
        <td
          style="
            width: 168pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s2"
            style="padding-left: 45pt; text-indent: 0pt; text-align: left"
          >
            Број раније пријаве
          </p>
        </td>
        <td
          style="
            width: 177pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p
            class="s2"
            style="
              padding-top: 2pt;
              padding-left: 29pt;
              padding-right: 28pt;
              text-indent: 0pt;
              text-align: center;
            "
          >
            Двословна ознака државе, регионалне или међународне организације
          </p>
        </td>
      </tr>
      <tr style="height: 28pt">
        <td
          style="
            width: 88pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="
              padding-left: 39pt;
              padding-right: 38pt;
              text-indent: 0pt;
              text-align: center;
            "
          >
            1.
          </p>
        </td>
        <td
          style="
            width: 89pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
        <td
          style="
            width: 168pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
        <td
          style="
            width: 177pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
      </tr>
      <tr style="height: 28pt">
        <td
          style="
            width: 88pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
          <p
            class="s5"
            style="
              padding-left: 39pt;
              padding-right: 38pt;
              text-indent: 0pt;
              text-align: center;
            "
          >
            2.
          </p>
        </td>
        <td
          style="
            width: 89pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
        <td
          style="
            width: 168pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
        <td
          style="
            width: 177pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
        >
          <p style="text-indent: 0pt; text-align: left"><br /></p>
        </td>
      </tr>
      <tr style="height: 31pt">
        <td
          style="
            width: 522pt;
            border-top-style: solid;
            border-top-width: 1pt;
            border-left-style: solid;
            border-left-width: 1pt;
            border-bottom-style: solid;
            border-bottom-width: 1pt;
            border-right-style: solid;
            border-right-width: 1pt;
          "
          colspan="4"
        >
          <ul id="l8">
            <li data-list-text="☐">
              <p
                class="s5"
                style="
                  padding-top: 8pt;
                  padding-left: 23pt;
                  text-indent: -15pt;
                  text-align: left;
                "
              >
                Подаци о осталим правима првенства су наведени у додатном листу
                2 у наставку овог захтева
              </p>
            </li>
          </ul>
        </td>
      </tr>
    </table>
  </body>
</html>
    </xsl:template>
</xsl:stylesheet>