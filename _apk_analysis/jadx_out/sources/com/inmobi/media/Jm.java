package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class Jm implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f25761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f25763c;

    public Jm(InterfaceC3580m9 interfaceC3580m9, String str, kotlinx.coroutines.c cVar) {
        this.f25761a = interfaceC3580m9;
        this.f25762b = str;
        this.f25763c = cVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25761a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("VideoLoaderHelper", "Video Load Error URL: " + this.f25762b);
        }
        P4.a(this.f25763c, Boolean.FALSE);
        return true;
    }
}
