package com.example.eniyanilavan.a8085emulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfview extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);
         pdfView = (PDFView)findViewById(R.id.abc);
         pdfView.fromAsset("opcode.pdf").load();
    }
}
