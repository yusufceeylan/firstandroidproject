package com.h5200051.muhammed_yusuf_ceylan_but_proje;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class AlertUtil {

    public static void dialogGoster(String baslik, String mesaj, Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(baslik);
        builder.setMessage(mesaj);
        builder.setNegativeButton("Hayır", null);
        builder.setPositiveButton("Evet", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                });
        builder.show();
    }
}
