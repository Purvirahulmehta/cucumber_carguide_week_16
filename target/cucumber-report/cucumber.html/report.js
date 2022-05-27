$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carDealer.feature");
formatter.feature({
  "line": 2,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test1"
    }
  ]
});
formatter.before({
  "duration": 12925136800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search Car dealer Name",
  "description": "",
  "id": "search-functionality;search-car-dealer-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on \u0027buy+sell\u0027tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click \u0027Find a Dealer\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see the dealer lists",
  "rows": [
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 8
    },
    {
      "cells": [
        "4WD Specialist Group"
      ],
      "line": 9
    },
    {
      "cells": [
        "5 Star Auto"
      ],
      "line": 10
    },
    {
      "cells": [
        "A \u0026 M Car Sales Pty Ltd"
      ],
      "line": 11
    },
    {
      "cells": [
        "A1 MOTORS COMPANY"
      ],
      "line": 12
    },
    {
      "cells": [
        "ANDREA MOTORI SERVICE"
      ],
      "line": 13
    },
    {
      "cells": [
        "Oxford Motors"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BuyTest.iAmOnHomepage()"
});
formatter.result({
  "duration": 273001501,
  "status": "passed"
});
formatter.match({
  "location": "BuyTest.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 257511100,
  "status": "passed"
});
formatter.match({
  "location": "DealerTest.iClickFindADealerLink()"
});
formatter.result({
  "duration": 2334212000,
  "status": "passed"
});
formatter.match({
  "location": "DealerTest.iSeeTheDealerLists(DataTable)"
});
formatter.result({
  "duration": 2765035194800,
  "error_message": "org.openqa.selenium.TimeoutException: TimedPromise timed out after 300000 ms\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-1D24U7H\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [123a0d12-bd60-4322-8354-5d67492c0c0d, clickElement {id\u003d86466c5e-dcf7-463a-a750-de008c3ef009}]\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 100.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20220519220738, moz:debuggerAddress: localhost:50496, moz:geckodriverVersion: 0.31.0, moz:headless: false, moz:processID: 14004, moz:profile: C:\\Users\\Purvi\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), se:cdp: ws://localhost:50496/devtoo..., se:cdpVersion: 85, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nElement: [[FirefoxDriver: firefox on WINDOWS (123a0d12-bd60-4322-8354-5d67492c0c0d)] -\u003e xpath: //span[contains(text(),\u0027Next\u0027)]]\nSession ID: 123a0d12-bd60-4322-8354-5d67492c0c0d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat sun.reflect.GeneratedMethodAccessor8.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat com.carsguide.utility.Utility.clickOnElement(Utility.java:51)\r\n\tat com.carsguide.pages.FindDealerPage.clickOnNextButton(FindDealerPage.java:45)\r\n\tat com.carsguide.steps.DealerTest.iSeeTheDealerLists(DealerTest.java:23)\r\n\tat ✽.Then I see the dealer lists(carDealer.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 10111290500,
  "status": "passed"
});
});