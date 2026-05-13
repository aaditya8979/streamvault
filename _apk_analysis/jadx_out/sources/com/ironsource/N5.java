package com.ironsource;

import android.util.Pair;
import com.ironsource.G7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class N5 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29884e = "Content-Type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29885f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private G7 f29886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<C5> f29889d;

    public N5(G7 g72, String str, String str2, ArrayList<C5> arrayList) {
        this.f29886a = g72;
        this.f29887b = str;
        this.f29888c = str2;
        this.f29889d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        G7.a aVarA;
        G7.a aVar = new G7.a(this.f29889d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Gd gdB = C4036g8.b(this.f29888c, this.f29887b, arrayList);
            aVarA = aVar.a(gdB.a()).a(gdB.f29471a);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e10.getLocalizedMessage());
            aVarA = aVar.a(e10 instanceof Fc).a(e10);
        }
        G7 g72 = this.f29886a;
        if (g72 != null) {
            g72.a(aVarA);
        }
    }
}
