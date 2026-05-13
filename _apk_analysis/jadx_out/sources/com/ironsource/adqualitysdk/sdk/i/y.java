package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<T> extends w<WebView, T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private is f3208;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private aa f3209;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<T, aa> f3210 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private y<T>.c f3211 = new c();

    public class c {

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private boolean f3222;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3223;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3224;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3225;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3226;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3227;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3228;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<String> f3229;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3230;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public List<String> f3231 = new ArrayList();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3232;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public final y<T>.c m7159(boolean z10) {
            this.f3226 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final y<T>.c m7160(boolean z10) {
            this.f3222 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final y<T>.c m7161(boolean z10) {
            this.f3224 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final y<T>.c m7162(boolean z10) {
            this.f3225 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final y<T>.c m7163(boolean z10) {
            this.f3227 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7164(String str) {
            this.f3228 = str;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7165(List<String> list) {
            this.f3229 = list;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7166(boolean z10) {
            this.f3232 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m7167(List<String> list) {
            if (list != null) {
                this.f3231 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m7168(boolean z10) {
            this.f3223 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final y<T>.c m7169(boolean z10) {
            this.f3230 = z10;
            return this;
        }
    }

    public y(is isVar) {
        this.f3208 = isVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public void m7143(T t10, List<WebView> list) {
        (((c) this.f3211).f3226 ? this.f3210.get(t10) : this.f3209).m4335(list);
        if (((c) this.f3211).f3232) {
            (((c) this.f3211).f3226 ? this.f3210.get(t10) : this.f3209).m4341(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7145(y<T>.c cVar) {
        this.f3211 = cVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo4362(T t10, List<WebView> list);

    /* JADX INFO: renamed from: ﻛ */
    public void mo7103(T t10) {
        mo5782(IronSourceVideoBridge.jsonObjectInit(), (((c) this.f3211).f3226 ? this.f3210.get(t10) : this.f3209).m4333(), t10);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7146(final JSONObject jSONObject, final T t10, String str) {
        boolean z10 = ((c) this.f3211).f3230 && !TextUtils.isEmpty(((c) this.f3211).f3228);
        aa aaVarMo4368 = ((c) this.f3211).f3226 ? this.f3210.get(t10) : this.f3209;
        if (aaVarMo4368 == null) {
            aaVarMo4368 = mo4368();
            if (((c) this.f3211).f3226) {
                this.f3210.put(t10, aaVarMo4368);
            } else {
                this.f3209 = aaVarMo4368;
            }
            aaVarMo4368.m7127(mo4366());
        }
        aaVarMo4368.m4336();
        aaVarMo4368.m4337(((c) this.f3211).f3228, ((c) this.f3211).f3229, z10, ((c) this.f3211).f3223, ((c) this.f3211).f3224);
        aaVarMo4368.m4341(str);
        if (!((c) this.f3211).f3225) {
            super.mo4338(jSONObject, null, t10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo4362(t10, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        is isVar = this.f3208;
        if (isVar != null) {
            arrayList2 = isVar.mo5813(t10);
        }
        final List<WebView> listM6859 = jx.m6859(arrayList, arrayList2);
        if (listM6859.isEmpty() || ((c) this.f3211).f3227) {
            View viewMo4367 = mo4367(t10);
            if (viewMo4367 != null) {
                viewMo4367.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3216 = 1;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3219;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f3218 = {17530, 11140, 39882, 2871, 64379, 27486, 55936, 19138, 14897, 43623, 6783, 35223, 31208, 59700, 22884, 51547, 47232, 10436, 38948, 47235, 55161, 26414, 63438, 1920, 38887, 9825, 46643, 50830, 22172, 59050, 30021, 34107, 5590, 42399, 13744, 17506, 54296, 25796, 62608, 1196, 37744, 9021};

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static long f3217 = -5459287922733060147L;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m7148(int i10, int i11, char c10) {
                        String str2;
                        synchronized (d.f1675) {
                            char[] cArr = new char[i10];
                            d.f1674 = 0;
                            while (true) {
                                int i12 = d.f1674;
                                if (i12 < i10) {
                                    cArr[i12] = (char) ((((long) f3218[i11 + i12]) ^ (((long) i12) * f3217)) ^ ((long) c10));
                                    d.f1674 = i12 + 1;
                                } else {
                                    str2 = new String(cArr);
                                }
                            }
                        }
                        return str2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            y.this.mo4362(t10, arrayList3);
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            int i18 = f3219 + 23;
                            f3216 = i18 % 128;
                            int i19 = i18 % 2;
                            View viewMo43672 = y.this.mo4367(t10);
                            if (!(viewMo43672 == null)) {
                                int i20 = f3216 + 77;
                                f3219 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    boolean unused = y.this.f3211.f3227;
                                    throw null;
                                }
                                if (!y.this.f3211.f3227) {
                                    viewMo43672.removeOnLayoutChangeListener(this);
                                }
                            }
                            y.this.m7143(t10, arrayList3);
                            y.this.mo5779(IronSourceVideoBridge.jsonObjectInit(), arrayList3.get(0), t10);
                        } catch (Throwable th2) {
                            kd.m6948(m7148(19 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17468)).intern(), m7148((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, TextUtils.lastIndexOf("", '0') + 20, (char) (47302 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), th2, false);
                        }
                    }
                });
            }
            if (listM6859.isEmpty()) {
                super.mo4338(jSONObject, null, t10);
                return;
            }
        }
        if (((c) this.f3211).f3222) {
            t.m7077().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.m7143(t10, (List<WebView>) listM6859);
                    y.super.mo4338(jSONObject, (WebView) listM6859.get(0), t10);
                }
            });
        } else {
            m7143(t10, listM6859);
            super.mo4338(jSONObject, listM6859.get(0), t10);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract r<WebView, T> mo4366();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m7147(is isVar) {
        this.f3208 = isVar;
    }

    /* JADX INFO: renamed from: ｋ */
    public void mo7105(T t10, String str) {
        m7146(IronSourceVideoBridge.jsonObjectInit(), (Object) t10, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo4338(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo4343(jSONObject, (WebView) obj, obj2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    public final String mo4339(T t10) {
        return (((c) this.f3211).f3226 ? this.f3210.get(t10) : this.f3209).mo4339(t10);
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract View mo4367(T t10);

    /* JADX INFO: renamed from: ﾒ */
    public abstract aa mo4368();
}
