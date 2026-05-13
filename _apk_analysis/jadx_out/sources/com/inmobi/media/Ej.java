package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class Ej implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f25397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25398b;

    public Ej(String str, byte[] bArr) {
        tn.p.k(bArr, "imageBytes");
        tn.p.k(str, "location");
        this.f25397a = bArr;
        this.f25398b = str;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.f25397a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        tn.p.h(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.f25398b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, InMobiFilesBridge.fileOutputStreamCtor(new File(this.f25398b + "/" + str)));
        return this.f25398b + "/" + str;
    }
}
