package com.example.tt_bssd5250_101

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.size

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetJavaScriptEnabled", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.connet4Button)
        val button2 = findViewById<Button>(R.id.starfieldButton)

        button1.setOnClickListener {
            val textView = findViewById<TextView>(R.id.connet4Textview)
            textView.text = "https://github.com/LiteTJ/connect-four"
            val webView = findViewById<WebView>(R.id.connetWebview)
            loadInternetDataTo(webView,"file:///android_asset/connect4/index.html")
        }

        button2.setOnClickListener {
            val textView = findViewById<TextView>(R.id.starfieldTextView)
            textView.text = "https://github.com/jakesgordon/javascript-starfield"
            val webView = findViewById<WebView>(R.id.starfieldWebview)
            loadInternetDataTo(webView, "file:///android_asset/starfield/index.html")
        }
    }

    @SuppressLint("JavascriptInterface")
    private fun loadInternetDataTo(webView: WebView, url:String) {
        webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.loadUrl(url)
    }
}