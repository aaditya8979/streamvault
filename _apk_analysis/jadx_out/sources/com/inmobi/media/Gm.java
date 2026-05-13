package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Gm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f25551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3580m9 f25552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K2 f25553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f25554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f25559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25560j;

    public Gm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25559i = obj;
        this.f25560j |= Integer.MIN_VALUE;
        return Mm.a((ExoPlayer) null, (ArrayList) null, (InterfaceC3580m9) null, (K2) null, false, (ContinuationImpl) this);
    }
}
