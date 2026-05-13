package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C3978d4;
import com.ironsource.C4157n2;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.style.model.b;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f36380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private XMLView f36381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f36382j;

    public class a implements com.mbridge.msdk.config.component.style.inter.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("XMLViewComponent", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("view_tag", str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapK = StyleCpt.this.k();
            if (!mapK.isEmpty()) {
                map2.put("all_properties", mapK);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(int i10) {
        XMLView xMLView;
        p();
        if (e() == null || (xMLView = this.f36381i) == null) {
            return;
        }
        xMLView.setVisibility(i10);
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put("view_tag", view.getTag());
            a(a("903009", map));
        }
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object objB = aVar.b();
            View view2 = objB instanceof View ? (View) objB : null;
            if (view2 == null) {
                q0.b("XMLViewComponent", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error adding widget: " + e10.getMessage());
        }
    }

    private void a(String str, String str2) {
        q0.b("XMLViewComponent", str2);
        HashMap map = new HashMap();
        map.put("reason", str2);
        map.put("code", str);
        if (this.f36380h.d() != null) {
            q0.b("XMLViewComponent", map.toString());
        } else {
            a(a("903007", map));
        }
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("XMLViewComponent", "Widget view is null");
                return;
            }
            String strE = aVar.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            String[] strArrE = e(strE);
            if (strArrE.length != 2) {
                q0.b("XMLViewComponent", "Invalid widget location format: " + strE);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            view.setX(i10);
            view.setY(i11);
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error relocating widget: " + e10.getMessage());
        }
    }

    private View c(String str) {
        XMLView xMLView = this.f36381i;
        return xMLView == null ? e().findViewWithTag(str) : xMLView.findViewWithTag(str);
    }

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put("view_tag", view.getTag());
            a(a("903008", map));
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("XMLViewComponent", "Widget view is null");
                return;
            }
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            String[] strArrE = e(strF);
            if (strArrE.length != 2) {
                q0.b("XMLViewComponent", "Invalid widget size format: " + strF);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error resizing widget: " + e10.getMessage());
        }
    }

    private String d(String str) {
        com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(str, 2, this.f36380h.b());
        if (bVarA != null) {
            return bVarA.e() ? bVarA.d() : "";
        }
        return "";
    }

    private String[] e(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.replaceAll("[\\[\\]]", "").split(StringUtils.COMMA);
    }

    private void g() {
        if (this.f36381i != null && e() != null) {
            HashMap map = new HashMap();
            e().removeView(this.f36381i);
            Map<String, Object> mapK = k();
            if (!mapK.isEmpty()) {
                map.putAll(mapK);
            }
            a(a("903005", map));
        }
        Object objB = this.f35754d.b("sdk_context");
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    private void h() {
        String strA = this.f36380h.a();
        if (TextUtils.isEmpty(strA)) {
            a("2000005", "Component command is null");
            return;
        }
        byte b10 = -1;
        try {
            int iHashCode = strA.hashCode();
            if (iHashCode != -934592106) {
                if (iHashCode != 3202370) {
                    if (iHashCode != 3529469) {
                        if (iHashCode == 94756344 && strA.equals("close")) {
                            b10 = 3;
                        }
                    } else if (strA.equals(C4157n2.f33013v)) {
                        b10 = 0;
                    }
                } else if (strA.equals("hide")) {
                    b10 = 1;
                }
            } else if (strA.equals("render")) {
                b10 = 2;
            }
            if (b10 == 0) {
                r();
                return;
            }
            if (b10 == 1) {
                l();
            } else if (b10 == 2) {
                a(8);
            } else {
                if (b10 != 3) {
                    return;
                }
                g();
            }
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error in doRenderTemplateAction", e10);
            a("", "Command execute error " + e10.getMessage());
        }
    }

    private void i() {
        b bVar = this.f36380h;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.f36380h.d()) {
            if (aVar != null) {
                String strA = aVar.a();
                String strD = aVar.d();
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strD)) {
                    View viewC = c(strD);
                    if (viewC == null) {
                        q0.b("XMLViewComponent", "Widget view not found: " + strD);
                    } else {
                        byte b10 = -1;
                        try {
                            int iHashCode = strA.hashCode();
                            if (iHashCode != -934610812) {
                                if (iHashCode != 96417) {
                                    if (iHashCode != 3202370) {
                                        if (iHashCode == 3529469 && strA.equals(C4157n2.f33013v)) {
                                            b10 = 0;
                                        }
                                    } else if (strA.equals("hide")) {
                                        b10 = 1;
                                    }
                                } else if (strA.equals(ImpressionLog.f51742l)) {
                                    b10 = 2;
                                }
                            } else if (strA.equals("remove")) {
                                b10 = 3;
                            }
                            if (b10 == 0) {
                                c(viewC);
                            } else if (b10 == 1) {
                                a(viewC);
                            } else if (b10 == 2) {
                                a(viewC, aVar);
                            } else if (b10 == 3) {
                                b(viewC);
                            }
                            c(viewC, aVar);
                            b(viewC, aVar);
                        } catch (Exception e10) {
                            q0.b("XMLViewComponent", "Error in doWidgetViewAction", e10);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        b bVar = this.f36380h;
        if (bVar == null || TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f36381i = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.f36380h.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String strC;
        List<com.mbridge.msdk.config.component.style.model.a> listD = this.f36380h.d();
        if (listD != null && !listD.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : listD) {
                if (aVar != null && (strC = aVar.c()) != null) {
                    strC.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.f36381i);
    }

    private void l() {
        XMLView xMLView = this.f36381i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        String strC = this.f36380h.c();
        if (TextUtils.isEmpty(strC)) {
            a("2000001", "Template URL is empty");
            return;
        }
        String strD = d(strC);
        if (strD == null || TextUtils.isEmpty(strD)) {
            a("2000003", "XML paths is empty");
            return;
        }
        try {
            XMLView xMLView = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(strD, e(), this.f35754d);
            this.f36381i = xMLView;
            if (xMLView != null) {
                xMLView.setRenderMap(strC);
                this.f36381i.setXmlViewActionListener(this.f36382j);
            } else {
                a("2000004", "xml render fail");
            }
        } catch (Exception e10) {
            a("2000004", e10.getMessage());
        }
    }

    private void q() {
        if (this.f36382j != null) {
            return;
        }
        this.f36382j = new a();
    }

    private void r() {
        HashMap map = new HashMap();
        a(a("903002", map));
        if (this.f36381i == null) {
            a(0);
        }
        Map<String, Object> mapK = k();
        if (!mapK.isEmpty()) {
            map.putAll(mapK);
        }
        a(a("903006", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        q();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.hashCode();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals(C3978d4.i.f31366u0)) {
            n();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("url");
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f36380h.c());
                    }
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "903001";
        this.f36380h = new b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f36384b.m();
            }
        });
    }

    public void n() {
        a(a("903004", new HashMap()));
    }

    public void o() {
        a(a("903003", new HashMap()));
    }
}
