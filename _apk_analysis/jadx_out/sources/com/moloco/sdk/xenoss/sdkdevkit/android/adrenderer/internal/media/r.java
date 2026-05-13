package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r {
    @NotNull
    public static final n.a.AbstractC0607a a(@NotNull Exception exc) {
        tn.p.k(exc, "e");
        return exc instanceof UnknownHostException ? n.a.AbstractC0607a.q.f48262a : exc instanceof SocketException ? n.a.AbstractC0607a.i.f48254a : exc instanceof SSLHandshakeException ? n.a.AbstractC0607a.j.f48255a : exc instanceof IOException ? n.a.AbstractC0607a.f.f48251a : exc instanceof SecurityException ? n.a.AbstractC0607a.g.f48252a : exc instanceof p ? n.a.AbstractC0607a.m.f48258a : exc instanceof NumberFormatException ? n.a.AbstractC0607a.l.f48257a : n.a.AbstractC0607a.r.f48263a;
    }
}
