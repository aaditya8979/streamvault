package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f17483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] f17484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f17485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f17486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f17487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f17489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g f17490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f17491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f17492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f17493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f17495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b f17496p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, b bVar, o oVar, List list) {
        this.f17485e = kVar;
        this.f17484d = aVarArr;
        this.f17483c = oVar;
        this.f17487g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            oVarArr[i10] = aVarArr[i10].f17573b;
            iArr[i10] = i10;
        }
        this.f17481a = bVar.f17471a.a();
        this.f17482b = bVar.f17471a.a();
        y yVar = new y(oVarArr);
        this.f17486f = yVar;
        this.f17496p = new e(yVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f17492l = uri;
        this.f17493m = bArr;
        this.f17494n = str;
        this.f17495o = bArr2;
    }
}
