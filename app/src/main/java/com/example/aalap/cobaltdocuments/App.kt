package com.example.aalap.cobaltdocuments

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class App : Application() {

    var appToken = ""

    fun setToken(token: String) {
        appToken = token
    }

    fun getToken(): String {
        return appToken
    }


    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        Realm.setDefaultConfiguration(

            RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .name("Document_Cobalt")
                .compactOnLaunch()
                .build()
        )

    }


}
//val json = "{\n" +
//        "    \"files\": [\n" +
//        "        {\n" +
//        "            \"parent\": \"5ab4130793c6e200380bdb08\",\n" +
//        "            \"name\": \"imperative-1\",\n" +
//        "            \"fileName\": \"imperative-1.pdf.pdf\",\n" +
//        "            \"createdDate\": \"2018-03-13T20:41:40.254Z\",\n" +
//        "            \"modifiedDate\": \"2018-03-22T20:34:21.176Z\",\n" +
//        "            \"size\": 204013,\n" +
//        "            \"mime\": \"pdf\",\n" +
//        "            \"status\": \"UPLOADED\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"allowPrint\": false,\n" +
//        "            \"allowEmail\": false,\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"provider\": \"amazon\",\n" +
//        "            \"text\": null,\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"TEST Folde\",\n" +
//        "                    \"id\": \"5ab4130793c6e200380bdb08\"\n" +
//        "                }\n" +
//        "            ],\n" +
//        "            \"id\": \"5aa8378476a7bc003da8315b\",\n" +
//        "            \"_id\": \"5aa8378476a7bc003da8315b\"\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"name\": \"User_man_male_profile_account_person_people\",\n" +
//        "            \"fileName\": \"User_man_male_profile_account_person_people.png\",\n" +
//        "            \"createdDate\": \"2018-03-15T16:19:32.081Z\",\n" +
//        "            \"modifiedDate\": \"2018-05-09T22:25:12.420Z\",\n" +
//        "            \"size\": 20396,\n" +
//        "            \"mime\": \"png\",\n" +
//        "            \"status\": \"UPLOADED\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"allowPrint\": false,\n" +
//        "            \"allowEmail\": false,\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"provider\": \"amazon\",\n" +
//        "            \"text\": null,\n" +
//        "            \"virtualPath\": [],\n" +
//        "            \"id\": \"5aaa9d149ae8b300381e87a3\",\n" +
//        "            \"_id\": \"5aaa9d149ae8b300381e87a3\"\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"name\": \"imagesdas das da1\",\n" +
//        "            \"fileName\": \"images.png\",\n" +
//        "            \"createdDate\": \"2018-04-09T21:12:25.333Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-25T16:24:05.959Z\",\n" +
//        "            \"size\": 5389,\n" +
//        "            \"mime\": null,\n" +
//        "            \"status\": \"UPLOADED\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"allowPrint\": false,\n" +
//        "            \"allowEmail\": false,\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"provider\": null,\n" +
//        "            \"text\": null,\n" +
//        "            \"virtualPath\": [],\n" +
//        "            \"id\": \"5acbd739ee8430003c376dce\",\n" +
//        "            \"_id\": \"5acbd739ee8430003c376dce\"\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"parent\": \"5bd0831f3407f40040d46781\",\n" +
//        "            \"name\": \"Test210\",\n" +
//        "            \"fileName\": \"Screen%20Shot%202018-08-29%20at%201.12.51%20PM.png\",\n" +
//        "            \"createdDate\": \"2018-10-24T14:36:21.573Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-24T17:02:49.222Z\",\n" +
//        "            \"size\": 117658,\n" +
//        "            \"mime\": \"png\",\n" +
//        "            \"status\": \"UPLOADED\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"allowPrint\": false,\n" +
//        "            \"allowEmail\": true,\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"provider\": \"amazon\",\n" +
//        "            \"text\": null,\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"id\": \"5bd0831f3407f40040d46781\",\n" +
//        "                    \"name\": \"Test203\"\n" +
//        "                }\n" +
//        "            ],\n" +
//        "            \"id\": \"5bd083652eea94004613d1fb\",\n" +
//        "            \"_id\": \"5bd083652eea94004613d1fb\"\n" +
//        "        }\n" +
//        "    ],\n" +
//        "    \"folders\": [\n" +
//        "        {\n" +
//        "            \"id\": \"5ab4130793c6e200380bdb08\",\n" +
//        "            \"_id\": \"5ab4130793c6e200380bdb08\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"TEST Folde\",\n" +
//        "            \"icon\": \"icon-bcat2\",\n" +
//        "            \"color\": \"#c8b553\",\n" +
//        "            \"createdDate\": \"2018-03-22T20:33:11.823Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-09T17:57:51.038Z\",\n" +
//        "            \"owner\": \"34\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:2920\",\n" +
//        "                \"1:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5abd31a0df763d00433018e1\",\n" +
//        "            \"_id\": \"5abd31a0df763d00433018e1\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"new test\",\n" +
//        "            \"icon\": \"icon-bcat3\",\n" +
//        "            \"color\": \"#73763e\",\n" +
//        "            \"createdDate\": \"2018-03-29T18:34:08.210Z\",\n" +
//        "            \"modifiedDate\": \"2018-04-03T17:32:27.587Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5ac238213761eb0032dc42b1\",\n" +
//        "            \"_id\": \"5ac238213761eb0032dc42b1\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"testyl\",\n" +
//        "            \"icon\": \"icon-bcat3\",\n" +
//        "            \"color\": \"#4bd559\",\n" +
//        "            \"createdDate\": \"2018-04-02T14:03:13.301Z\",\n" +
//        "            \"modifiedDate\": \"2018-04-02T14:03:13.301Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5ac24154deb200003967f284\",\n" +
//        "            \"_id\": \"5ac24154deb200003967f284\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"bbb updated\",\n" +
//        "            \"icon\": \"icon-btyfolder\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-04-02T14:42:28.878Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-19T17:07:21.200Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"[\\\"*:*\\\"]\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5ac24264f2c5c400331893fc\",\n" +
//        "            \"_id\": \"5ac24264f2c5c400331893fc\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"TestYL1\",\n" +
//        "            \"icon\": \"icon-bcat2\",\n" +
//        "            \"color\": \"#924c4c\",\n" +
//        "            \"createdDate\": \"2018-04-02T14:47:00.901Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-17T20:19:45.235Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5ac244ed3761eb0032dc42b7\",\n" +
//        "            \"_id\": \"5ac244ed3761eb0032dc42b7\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"testYL3\",\n" +
//        "            \"icon\": \"icon-btyfolder\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-04-02T14:57:49.217Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-24T17:10:17.240Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5ac3bb10f2c5c400331893fe\",\n" +
//        "            \"_id\": \"5ac3bb10f2c5c400331893fe\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Anand's Directory\",\n" +
//        "            \"icon\": \"icon-bcat46\",\n" +
//        "            \"color\": \"#71a4ce\",\n" +
//        "            \"createdDate\": \"2018-04-03T17:34:08.629Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-25T16:23:50.427Z\",\n" +
//        "            \"owner\": \"2897\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5acbd257ee8430003c376dca\",\n" +
//        "            \"_id\": \"5acbd257ee8430003c376dca\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"sst\",\n" +
//        "            \"icon\": \"icon-btyfolder\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-04-09T20:51:35.037Z\",\n" +
//        "            \"modifiedDate\": \"2018-05-21T15:04:45.775Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:159\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5aff2d867039ac0038d2412a\",\n" +
//        "            \"_id\": \"5aff2d867039ac0038d2412a\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"sharing test\",\n" +
//        "            \"icon\": \"icon-bcat2\",\n" +
//        "            \"color\": \"#5ea035\",\n" +
//        "            \"createdDate\": \"2018-05-18T19:46:14.074Z\",\n" +
//        "            \"modifiedDate\": \"2018-05-18T19:56:01.446Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b1ac714e7931e0043a7d5dc\",\n" +
//        "            \"_id\": \"5b1ac714e7931e0043a7d5dc\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"test-directory\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#eae682\",\n" +
//        "            \"createdDate\": \"2018-06-08T18:12:36.739Z\",\n" +
//        "            \"modifiedDate\": \"2018-06-08T18:12:36.739Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b1ac739e7931e0043a7d5dd\",\n" +
//        "            \"_id\": \"5b1ac739e7931e0043a7d5dd\",\n" +
//        "            \"parent\": \"5b1ace33e7931e0043a7d5de\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"test two-directory\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#e4b073\",\n" +
//        "            \"createdDate\": \"2018-06-08T18:13:13.017Z\",\n" +
//        "            \"modifiedDate\": \"2018-06-08T20:51:38.938Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"test-directory\",\n" +
//        "                    \"id\": \"5b1ac714e7931e0043a7d5dc\"\n" +
//        "                },\n" +
//        "                {\n" +
//        "                    \"name\": \"test four\",\n" +
//        "                    \"id\": \"5b1ace33e7931e0043a7d5de\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b1ac7db0a7594003dbe4f15\",\n" +
//        "            \"_id\": \"5b1ac7db0a7594003dbe4f15\",\n" +
//        "            \"parent\": \"5b1ac739e7931e0043a7d5dd\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"test three-directory\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#f01616\",\n" +
//        "            \"createdDate\": \"2018-06-08T18:15:55.921Z\",\n" +
//        "            \"modifiedDate\": \"2018-06-08T18:15:55.921Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"test-directory\",\n" +
//        "                    \"id\": \"5b1ac714e7931e0043a7d5dc\"\n" +
//        "                },\n" +
//        "                {\n" +
//        "                    \"name\": \"test two-directory\",\n" +
//        "                    \"id\": \"5b1ac739e7931e0043a7d5dd\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b1ace33e7931e0043a7d5de\",\n" +
//        "            \"_id\": \"5b1ace33e7931e0043a7d5de\",\n" +
//        "            \"parent\": \"5b1ac714e7931e0043a7d5dc\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"test four\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#c82121\",\n" +
//        "            \"createdDate\": \"2018-06-08T18:42:59.981Z\",\n" +
//        "            \"modifiedDate\": \"2018-06-08T18:43:56.292Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"test-directory\",\n" +
//        "                    \"id\": \"5b1ac714e7931e0043a7d5dc\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b3e58a3233507003d181e7a\",\n" +
//        "            \"_id\": \"5b3e58a3233507003d181e7a\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"new test for create\",\n" +
//        "            \"icon\": \"icon-bcat19\",\n" +
//        "            \"color\": \"#ed7919\",\n" +
//        "            \"createdDate\": \"2018-07-05T17:42:59.709Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-05T17:44:22.575Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b3e5d31233507003d181e7b\",\n" +
//        "            \"_id\": \"5b3e5d31233507003d181e7b\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"new test\",\n" +
//        "            \"icon\": \"icon-bcat2\",\n" +
//        "            \"color\": \"#d62929\",\n" +
//        "            \"createdDate\": \"2018-07-05T18:02:25.616Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-05T18:02:25.616Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b3fd2da8cf56c004702a9a8\",\n" +
//        "            \"_id\": \"5b3fd2da8cf56c004702a9a8\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"new test doo\",\n" +
//        "            \"icon\": \"icon-bcat6\",\n" +
//        "            \"color\": \"#be7c17\",\n" +
//        "            \"createdDate\": \"2018-07-06T20:36:42.175Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-09T18:22:13.151Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b3fd3288cf56c004702a9a9\",\n" +
//        "            \"_id\": \"5b3fd3288cf56c004702a9a9\",\n" +
//        "            \"parent\": \"5b477a15e6387b0042f807ec\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"taklif to revani\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#68a726\",\n" +
//        "            \"createdDate\": \"2018-07-06T20:38:00.145Z\",\n" +
//        "            \"modifiedDate\": \"2018-09-11T19:11:38.951Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"1:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"Jayraj's Directory\",\n" +
//        "                    \"id\": \"5b4779e2e6387b0042f807eb\"\n" +
//        "                },\n" +
//        "                {\n" +
//        "                    \"name\": \"Jayraj's Second Directory\",\n" +
//        "                    \"id\": \"5b477a15e6387b0042f807ec\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b437a09e6387b0042f807e5\",\n" +
//        "            \"_id\": \"5b437a09e6387b0042f807e5\",\n" +
//        "            \"parent\": \"5b1ac714e7931e0043a7d5dc\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"test folder\",\n" +
//        "            \"icon\": \"icon-bcat6\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-07-09T15:06:49.960Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-09T15:07:34.470Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"test-directory\",\n" +
//        "                    \"id\": \"5b1ac714e7931e0043a7d5dc\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b4779e2e6387b0042f807eb\",\n" +
//        "            \"_id\": \"5b4779e2e6387b0042f807eb\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Jayraj's Directory\",\n" +
//        "            \"icon\": \"icon-bcat41\",\n" +
//        "            \"color\": \"#3698e2\",\n" +
//        "            \"createdDate\": \"2018-07-12T15:55:14.787Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-10T16:47:13.179Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"[\\\"*:*\\\"]\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b477a15e6387b0042f807ec\",\n" +
//        "            \"_id\": \"5b477a15e6387b0042f807ec\",\n" +
//        "            \"parent\": \"5b4779e2e6387b0042f807eb\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Jayraj's Second Directory\",\n" +
//        "            \"icon\": \"icon-bcat13\",\n" +
//        "            \"color\": \"#169ce3\",\n" +
//        "            \"createdDate\": \"2018-07-12T15:56:05.269Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-12T15:56:25.827Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"Jayraj's Directory\",\n" +
//        "                    \"id\": \"5b4779e2e6387b0042f807eb\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b477afc233507003d181e83\",\n" +
//        "            \"_id\": \"5b477afc233507003d181e83\",\n" +
//        "            \"parent\": \"5b477a15e6387b0042f807ec\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Jayraj's Third Directory\",\n" +
//        "            \"icon\": \"icon-bcat4\",\n" +
//        "            \"color\": \"#e79225\",\n" +
//        "            \"createdDate\": \"2018-07-12T15:59:56.889Z\",\n" +
//        "            \"modifiedDate\": \"2018-07-12T16:00:15.864Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"name\": \"Jayraj's Directory\",\n" +
//        "                    \"id\": \"5b4779e2e6387b0042f807eb\"\n" +
//        "                },\n" +
//        "                {\n" +
//        "                    \"name\": \"Jayraj's Second Directory\",\n" +
//        "                    \"id\": \"5b477a15e6387b0042f807ec\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5b997d2524391a00565ae493\",\n" +
//        "            \"_id\": \"5b997d2524391a00565ae493\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Test101\",\n" +
//        "            \"icon\": \"icon-bcat1\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-09-12T20:55:01.720Z\",\n" +
//        "            \"modifiedDate\": \"2018-09-12T20:55:01.720Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5baa679e46c57a0040972c41\",\n" +
//        "            \"_id\": \"5baa679e46c57a0040972c41\",\n" +
//        "            \"parent\": \"5b4779e2e6387b0042f807eb\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"new test 2\",\n" +
//        "            \"icon\": \"icon-bcat44\",\n" +
//        "            \"color\": \"#ba19be\",\n" +
//        "            \"createdDate\": \"2018-09-25T16:51:42.986Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-17T20:17:46.324Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"[\\\"*:*\\\"]\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"id\": \"5b4779e2e6387b0042f807eb\",\n" +
//        "                    \"name\": \"Jayraj's Directory\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5bd0831f3407f40040d46781\",\n" +
//        "            \"_id\": \"5bd0831f3407f40040d46781\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Test203\",\n" +
//        "            \"icon\": \"icon-bcat1\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-10-24T14:35:11.680Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-24T14:35:11.680Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": []\n" +
//        "        },\n" +
//        "        {\n" +
//        "            \"id\": \"5bd083383407f40040d46783\",\n" +
//        "            \"_id\": \"5bd083383407f40040d46783\",\n" +
//        "            \"parent\": \"5bd0831f3407f40040d46781\",\n" +
//        "            \"module\": \"mobileplan\",\n" +
//        "            \"name\": \"Test204\",\n" +
//        "            \"icon\": \"icon-bcat13\",\n" +
//        "            \"color\": \"#cccccc\",\n" +
//        "            \"createdDate\": \"2018-10-24T14:35:36.214Z\",\n" +
//        "            \"modifiedDate\": \"2018-10-24T14:35:36.214Z\",\n" +
//        "            \"owner\": \"39\",\n" +
//        "            \"permissions\": [\n" +
//        "                \"*:*\"\n" +
//        "            ],\n" +
//        "            \"virtualPath\": [\n" +
//        "                {\n" +
//        "                    \"id\": \"5bd0831f3407f40040d46781\",\n" +
//        "                    \"name\": \"Test203\"\n" +
//        "                }\n" +
//        "            ]\n" +
//        "        }\n" +
//        "    ]\n" +
//        "}"