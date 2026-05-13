package sg.bigo.ads.core.adview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.adview.e;
import sg.bigo.ads.core.adview.e.b;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {
    public b(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
    }

    public final void a(sg.bigo.ads.api.core.b bVar, final String str) {
        if (bVar == null) {
            return;
        }
        this.f83574a.removeAllViews();
        b.e eVarB = bVar.B();
        AdImageView adImageView = new AdImageView(this.f83574a.getContext());
        adImageView.setIconTag(true);
        String strA = eVarB != null ? eVarB.a() : "";
        final String strB = eVarB != null ? eVarB.b() : "";
        final String strD = eVarB != null ? eVarB.d() : "";
        final String strE = eVarB != null ? eVarB.e() : "";
        final String strG = eVarB != null ? eVarB.g() : "";
        final String strH = eVarB != null ? eVarB.h() : "";
        adImageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                sg.bigo.ads.api.a<?> aVar = b.this.f83574a;
                String str3 = strB;
                String str4 = str;
                String str5 = strD;
                String str6 = strE;
                String str7 = strG;
                String str8 = strH;
                if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8)) {
                    return;
                }
                e.a aVar2 = new e.a(aVar);
                aVar2.f83578b = str3;
                aVar2.f83579c = str4;
                aVar2.f83580d = str5;
                aVar2.f83581e = str6;
                aVar2.f83582f = str7;
                aVar2.f83583g = str8;
                e eVar = new e(aVar2, (byte) 0);
                Activity activityA = sg.bigo.ads.common.utils.c.a(eVar.f83576a.f83577a);
                if (activityA == null) {
                    str2 = "Cannot find Activity from container view";
                } else {
                    if (!e.f83575b) {
                        e.b bVar2 = eVar.new b(activityA);
                        if (q.a((CharSequence) eVar.f83576a.f83578b) && q.a((CharSequence) eVar.f83576a.f83579c) && q.a((CharSequence) eVar.f83576a.f83580d) && q.a((CharSequence) eVar.f83576a.f83581e) && q.a((CharSequence) eVar.f83576a.f83582f) && q.a((CharSequence) eVar.f83576a.f83583g)) {
                            return;
                        }
                        bVar2.show();
                        e.f83575b = true;
                        return;
                    }
                    str2 = "Feedback dialog is showing. Cannot show again.";
                }
                sg.bigo.ads.common.t.a.b("Feedback", str2);
            }
        });
        if (TextUtils.isEmpty(strA)) {
            this.f83574a.setVisibility(8);
            return;
        }
        adImageView.a(strA, bVar.al());
        adImageView.setLayoutParams(new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this.f83574a.getContext(), 16), sg.bigo.ads.common.utils.e.a(this.f83574a.getContext(), 16), 17));
        adImageView.setTag("ad_options_real_view");
        a(adImageView);
    }
}
