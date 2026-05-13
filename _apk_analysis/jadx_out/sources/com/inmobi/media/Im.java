package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class Im implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f25668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f25670c;

    public Im(InterfaceC3580m9 interfaceC3580m9, String str, kotlinx.coroutines.c cVar) {
        this.f25668a = interfaceC3580m9;
        this.f25669b = str;
        this.f25670c = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25668a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.f25669b);
        }
        P4.a(this.f25670c, Boolean.TRUE);
    }
}
