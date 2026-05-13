package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4843hm implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5287ze f66930a = new C5287ze();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4805ga f66931b = new C4805ga();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Im f66932c = new Im();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4798g3 f66933d = new C4798g3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5001o2 f66934e = new C5001o2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5229x6 f66935f = new C5229x6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Em f66936g = new Em();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5062qd f66937h = new C5062qd();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D9 f66938i = new D9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4920km toModel(@NonNull C5245xm c5245xm) {
        C4894jm c4894jm = new C4894jm(this.f66931b.toModel(c5245xm.f67969i));
        c4894jm.f67045a = c5245xm.f67961a;
        c4894jm.f67054j = c5245xm.f67970j;
        c4894jm.f67047c = c5245xm.f67964d;
        c4894jm.f67046b = Arrays.asList(c5245xm.f67963c);
        c4894jm.f67051g = Arrays.asList(c5245xm.f67967g);
        c4894jm.f67050f = Arrays.asList(c5245xm.f67966f);
        c4894jm.f67048d = c5245xm.f67965e;
        c4894jm.f67049e = c5245xm.f67978r;
        c4894jm.f67052h = Arrays.asList(c5245xm.f67975o);
        c4894jm.f67055k = c5245xm.f67971k;
        c4894jm.f67056l = c5245xm.f67972l;
        c4894jm.f67061q = c5245xm.f67973m;
        c4894jm.f67059o = c5245xm.f67962b;
        c4894jm.f67060p = c5245xm.f67977q;
        c4894jm.f67064t = c5245xm.f67979s;
        c4894jm.f67065u = c5245xm.f67980t;
        c4894jm.f67062r = c5245xm.f67974n;
        c4894jm.f67066v = c5245xm.f67981u;
        c4894jm.f67067w = new RetryPolicyConfig(c5245xm.f67983w, c5245xm.f67984x);
        c4894jm.f67053i = this.f66935f.toModel(c5245xm.f67968h);
        C5170um c5170um = c5245xm.f67982v;
        if (c5170um != null) {
            this.f66930a.getClass();
            c4894jm.f67058n = new C5262ye(c5170um.f67792a, c5170um.f67793b);
        }
        C5220wm c5220wm = c5245xm.f67976p;
        if (c5220wm != null) {
            this.f66932c.getClass();
            c4894jm.f67063s = new Hm(c5220wm.f67913a);
        }
        C5046pm c5046pm = c5245xm.f67985y;
        if (c5046pm != null) {
            this.f66933d.getClass();
            c4894jm.f67068x = new C4746e3(c5046pm.f67541a);
        }
        C5021om c5021om = c5245xm.f67986z;
        if (c5021om != null) {
            c4894jm.f67069y = this.f66934e.toModel(c5021om);
        }
        C5195vm c5195vm = c5245xm.A;
        if (c5195vm != null) {
            this.f66936g.getClass();
            c4894jm.f67070z = new Dm(c5195vm.f67864a);
        }
        c4894jm.A = this.f66937h.toModel(c5245xm.B);
        C5095rm c5095rm = c5245xm.C;
        if (c5095rm != null) {
            this.f66938i.getClass();
            c4894jm.B = new C9(c5095rm.f67630a);
        }
        return new C4920km(c4894jm);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5245xm fromModel(@NonNull C4920km c4920km) {
        C5245xm c5245xm = new C5245xm();
        c5245xm.f67979s = c4920km.f67166u;
        c5245xm.f67980t = c4920km.f67167v;
        String str = c4920km.f67146a;
        if (str != null) {
            c5245xm.f67961a = str;
        }
        List list = c4920km.f67151f;
        if (list != null) {
            c5245xm.f67966f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c4920km.f67152g;
        if (list2 != null) {
            c5245xm.f67967g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c4920km.f67147b;
        if (list3 != null) {
            c5245xm.f67963c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c4920km.f67153h;
        if (list4 != null) {
            c5245xm.f67975o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c4920km.f67154i;
        if (map != null) {
            c5245xm.f67968h = this.f66935f.fromModel(map);
        }
        C5262ye c5262ye = c4920km.f67164s;
        if (c5262ye != null) {
            c5245xm.f67982v = this.f66930a.fromModel(c5262ye);
        }
        String str2 = c4920km.f67155j;
        if (str2 != null) {
            c5245xm.f67970j = str2;
        }
        String str3 = c4920km.f67148c;
        if (str3 != null) {
            c5245xm.f67964d = str3;
        }
        String str4 = c4920km.f67149d;
        if (str4 != null) {
            c5245xm.f67965e = str4;
        }
        String str5 = c4920km.f67150e;
        if (str5 != null) {
            c5245xm.f67978r = str5;
        }
        c5245xm.f67969i = this.f66931b.fromModel(c4920km.f67158m);
        String str6 = c4920km.f67156k;
        if (str6 != null) {
            c5245xm.f67971k = str6;
        }
        String str7 = c4920km.f67157l;
        if (str7 != null) {
            c5245xm.f67972l = str7;
        }
        c5245xm.f67973m = c4920km.f67161p;
        c5245xm.f67962b = c4920km.f67159n;
        c5245xm.f67977q = c4920km.f67160o;
        RetryPolicyConfig retryPolicyConfig = c4920km.f67165t;
        c5245xm.f67983w = retryPolicyConfig.maxIntervalSeconds;
        c5245xm.f67984x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c4920km.f67162q;
        if (str8 != null) {
            c5245xm.f67974n = str8;
        }
        Hm hm2 = c4920km.f67163r;
        if (hm2 != null) {
            this.f66932c.getClass();
            C5220wm c5220wm = new C5220wm();
            c5220wm.f67913a = hm2.f65339a;
            c5245xm.f67976p = c5220wm;
        }
        c5245xm.f67981u = c4920km.f67168w;
        C4746e3 c4746e3 = c4920km.f67169x;
        if (c4746e3 != null) {
            this.f66933d.getClass();
            C5046pm c5046pm = new C5046pm();
            c5046pm.f67541a = c4746e3.f66649a;
            c5245xm.f67985y = c5046pm;
        }
        C4976n2 c4976n2 = c4920km.f67170y;
        if (c4976n2 != null) {
            c5245xm.f67986z = this.f66934e.fromModel(c4976n2);
        }
        c5245xm.A = this.f66936g.fromModel(c4920km.f67171z);
        c5245xm.B = this.f66937h.fromModel(c4920km.A);
        c5245xm.C = this.f66938i.fromModel(c4920km.B);
        return c5245xm;
    }
}
