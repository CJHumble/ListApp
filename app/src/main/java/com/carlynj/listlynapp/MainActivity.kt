package com.carlynj.listlynapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWeb = findViewById<WebView>(R.id.MyWebView)

        myWeb.webViewClient = WebViewClient()
        myWeb.apply {
            loadUrl("https://shoppinglist.google.com/")

            settings.javaScriptEnabled = true

        }
    }
}