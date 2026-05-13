package yads;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes12.dex */
public final class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f93242a;

    public ok(pk pkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(pkVar.f93613b).setFlags(pkVar.f93614c).setUsage(pkVar.f93615d);
        int i10 = ib3.f90737a;
        if (i10 >= 29) {
            mk.a(usage, pkVar.f93616e);
        }
        if (i10 >= 32) {
            nk.a(usage, pkVar.f93617f);
        }
        this.f93242a = usage.build();
    }
}
