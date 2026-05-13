package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16568b;

    public e(f fVar, d dVar) {
        this.f16568b = fVar;
        this.f16567a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        f fVar = this.f16568b;
        if (fVar.f16574f == null || (cVar = fVar.f16570b) == null) {
            return;
        }
        d dVar = this.f16567a;
        StringBuilder sb2 = new StringBuilder("\n<script>\n");
        ArrayList<com.fyber.inneractive.sdk.flow.storepromo.model.a> arrayList = cVar.f16617a;
        StringBuilder sb3 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (com.fyber.inneractive.sdk.flow.storepromo.model.a aVar : arrayList) {
            int i12 = h.f16584a[aVar.f16614a.ordinal()];
            if (i12 == 1) {
                i10++;
                String str = i.f16585a;
                String str2 = String.format("app_screen_%d", Integer.valueOf(i10));
                sb3.append("var " + str2 + "_el = document.createElement('img');\n" + str2 + "_el.id = '" + str2 + "';\ndocument.getElementById('carousel').appendChild(" + str2 + "_el);\n");
                sb3.append(String.format(i.f16585a, Integer.valueOf(i10), aVar.f16615b));
                sb3.append(String.format(i.f16586b, Integer.valueOf(i10), Integer.valueOf(i10)));
            } else if (i12 == 2) {
                i11++;
                String str3 = i.f16585a;
                String str4 = String.format("app_video_url_%d", Integer.valueOf(i11));
                sb3.append("var " + str4 + "_el = document.createElement('video');\n" + str4 + "_el.id = '" + str4 + "';\ndocument.getElementById('carousel').appendChild(" + str4 + "_el);\n");
                sb3.append(String.format(i.f16587c, Integer.valueOf(i11), aVar.f16615b));
                sb3.append(String.format(i.f16588d, Integer.valueOf(i11), Integer.valueOf(i11)));
            } else if (i12 == 3) {
                sb3.append(String.format(i.f16589e, aVar.f16615b));
                sb3.append(i.f16590f);
            } else if (i12 == 4) {
                sb3.append(String.format(i.f16601q, aVar.f16615b));
                sb3.append(i.f16602r);
            }
        }
        sb2.append(sb3.toString());
        sb2.append(String.format(i.f16591g, cVar.f16618b.replace("`", "\\`")) + i.f16592h + String.format(i.f16593i, cVar.f16622f.replace("`", "\\`")) + i.f16594j + String.format(i.f16595k, cVar.f16623g.f16627b.replace("`", "\\`")) + i.f16596l + String.format(i.f16599o, cVar.f16623g.f16626a.replace("`", "\\`")) + i.f16600p + String.format(i.f16597m, cVar.f16623g.f16628c.replace("`", "\\`")) + i.f16598n);
        StringBuilder sb4 = new StringBuilder();
        boolean z10 = Boolean.parseBoolean(cVar.f16620d);
        boolean z11 = Boolean.parseBoolean(cVar.f16621e);
        sb4.append(i.a(z10, "in_app_purchases"));
        sb4.append(i.a(z11, "app_contains_ads"));
        sb4.append(i.a(z11 && z10, "app_subtitle_separator"));
        sb2.append(sb4.toString());
        sb2.append("</script>");
        String str5 = cVar.f16619c + sb2.toString();
        dVar.getClass();
        r.f19556b.post(new c(dVar, str5));
    }
}
