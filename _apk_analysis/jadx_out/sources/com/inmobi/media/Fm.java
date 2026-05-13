package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Fm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f25477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3580m9 f25478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f25479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25482f;

    public Fm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25481e = obj;
        this.f25482f |= Integer.MIN_VALUE;
        return Mm.a((MediaPlayer) null, (ArrayList) null, (C3605n9) null, this);
    }
}
