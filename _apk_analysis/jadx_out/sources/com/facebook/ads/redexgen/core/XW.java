package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XW {
    public static String[] A00 = {"0dslaS9HQNor4584P2qJWDauGUJuCUyD", "hmu58uVtuBegxtguAmxWdcC", "RnpWwwftYVF7ZcI60v", "9ipL7H1AQ7hrzmKFvXE", "pZ3KzhX3bLT6KZ2Vo7aJYVVuuWb7wszV", "0AfAa8bIuU", "cY7ucT44sLUlO9uXsqd9BA7lLs0feoWz", "ELBhZY2lRpRyd6u07AMv4seAD2bUSLiq"};

    public static Bitmap A00(C2529dL c2529dL, Bitmap bitmap, int i10) throws RSRuntimeException {
        RenderScript renderScriptCreate = null;
        Allocation allocationCreateFromBitmap = null;
        Allocation allocationCreateTyped = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScriptCreate = RenderScript.create(c2529dL);
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(i10);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (allocationCreateTyped != null) {
                allocationCreateTyped.destroy();
            }
            if (scriptIntrinsicBlurCreate != null) {
                scriptIntrinsicBlurCreate.destroy();
            }
        }
    }

    public static Bitmap A01(C2529dL c2529dL, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth() / i11;
        int height = bitmap.getHeight() / i11;
        if (width == 0 || height == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(1.0f / i11, 1.0f / i11);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            bitmapCreateBitmap = A00(c2529dL, bitmapCreateBitmap, i10);
            if (i11 == 1) {
                return bitmapCreateBitmap;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), true);
            if (A00[0].charAt(31) == 'y') {
                throw new RuntimeException();
            }
            A00[7] = "0rCXq5ZtodXnzNKgqAgAvAA6fcN2Rviw";
            bitmapCreateBitmap.recycle();
            return bitmapCreateScaledBitmap;
        } catch (RSRuntimeException unused) {
            return new C2034Oq().A02(bitmapCreateBitmap, i10);
        }
    }
}
