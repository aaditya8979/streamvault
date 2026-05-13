package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jj {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jj f2841;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public boolean f2843 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<jg> f2842 = new HashSet();

    @TargetApi(14)
    public static class b extends jj implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2844 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2845 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2846 = {852778607, 1982419963, -1875200446, 1662580092, -49784149, -1732858882, 492031467, -428128084, -556755272, 1117900764, 1234715372, 305635570, 1377257034, 1744949835, 1331503627, 1363535708, 1637706811, 691137695};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2847;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Activity> f2848;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2849;

        private b() {
            this.f2847 = new WeakHashMap();
        }

        public /* synthetic */ b(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m6759(final Activity activity) {
            this.f2848 = new WeakReference<>(activity);
            t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.b.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() throws Exception {
                    jw.m6837(activity);
                }
            });
            int i10 = f2845 + 109;
            f2844 = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m6760(Activity activity) {
            Iterator<jg> it = m6756().iterator();
            int i10 = f2844 + 43;
            f2845 = i10 % 128;
            int i11 = i10 % 2;
            while (it.hasNext()) {
                int i12 = f2844 + 121;
                f2845 = i12 % 128;
                if ((i12 % 2 == 0 ? 'W' : '\\') != 'W') {
                    it.next().mo4460(activity);
                } else {
                    it.next().mo4460(activity);
                    int i13 = 94 / 0;
                }
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6761(int[] iArr, int i10) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1934) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2846.clone();
                com.ironsource.adqualitysdk.sdk.i.e.f1935 = 0;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.e.f1935;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        com.ironsource.adqualitysdk.sdk.i.e.f1937 = (c10 << 16) + c11;
                        com.ironsource.adqualitysdk.sdk.i.e.f1936 = (c12 << 16) + c13;
                        com.ironsource.adqualitysdk.sdk.i.e.m6211(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = com.ironsource.adqualitysdk.sdk.i.e.f1937 ^ iArr2[i13];
                            com.ironsource.adqualitysdk.sdk.i.e.f1937 = i14;
                            com.ironsource.adqualitysdk.sdk.i.e.f1936 = com.ironsource.adqualitysdk.sdk.i.e.m6210(i14) ^ com.ironsource.adqualitysdk.sdk.i.e.f1936;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                            com.ironsource.adqualitysdk.sdk.i.e.f1937 = com.ironsource.adqualitysdk.sdk.i.e.f1936;
                            com.ironsource.adqualitysdk.sdk.i.e.f1936 = i15;
                        }
                        int i16 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                        com.ironsource.adqualitysdk.sdk.i.e.f1937 = com.ironsource.adqualitysdk.sdk.i.e.f1936;
                        com.ironsource.adqualitysdk.sdk.i.e.f1936 = i16;
                        com.ironsource.adqualitysdk.sdk.i.e.f1936 = i16 ^ iArr2[16];
                        com.ironsource.adqualitysdk.sdk.i.e.f1937 ^= iArr2[17];
                        int i17 = com.ironsource.adqualitysdk.sdk.i.e.f1935;
                        int i18 = com.ironsource.adqualitysdk.sdk.i.e.f1937;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = com.ironsource.adqualitysdk.sdk.i.e.f1936;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        com.ironsource.adqualitysdk.sdk.i.e.m6211(iArr2);
                        int i20 = com.ironsource.adqualitysdk.sdk.i.e.f1935;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        com.ironsource.adqualitysdk.sdk.i.e.f1935 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m6762(Activity activity) {
            Iterator<jg> it = m6756().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i10 = f2845 + 81;
                    f2844 = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                } else {
                    int i12 = f2845 + 67;
                    f2844 = i12 % 128;
                    int i13 = i12 % 2;
                    it.next().mo4461(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jj.class) {
                    if (this.f2848 == null) {
                        m6759(activity);
                        jj.class.notifyAll();
                    }
                }
                Iterator<jg> it = m6756().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 106370530, -106445027, 1314361584, 135943168, 1225542097, -2037163726}, ((byte) KeyEvent.getModifierMetaStateMask()) + 27).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i10 = f2845 + 79;
            f2844 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Iterator<jg> it = m6756().iterator();
                while (true) {
                    if ((it.hasNext() ? 'O' : 'A') != 'O') {
                        int i12 = f2845 + 7;
                        f2844 = i12 % 128;
                        int i13 = i12 % 2;
                        return;
                    }
                    it.next().onActivityDestroyed(activity);
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1011920759, -514237837, -799198377, 1956937021, -1778007821, 1924516393}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i10 = f2845 + 25;
            f2844 = i10 % 128;
            try {
                if ((i10 % 2 != 0 ? (char) 0 : '\\') != '\\') {
                    m6756().iterator();
                    throw null;
                }
                Iterator<jg> it = m6756().iterator();
                while (true) {
                    if (!(it.hasNext())) {
                        return;
                    }
                    int i11 = f2845 + 15;
                    f2844 = i11 % 128;
                    int i12 = i11 % 2;
                    it.next().onActivityPaused(activity);
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Drawable.resolveOpacity(0, 0) + 30).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 542832659, 354471783, 190147778, 1166495507, -958284366, -5727967}, (ViewConfiguration.getScrollBarSize() >> 8) + 25).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i10 = f2845 + 13;
            f2844 = i10 % 128;
            int i11 = i10 % 2;
            try {
                m6759(activity);
                Iterator<jg> it = m6756().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return;
                    }
                    int i12 = f2845 + 3;
                    f2844 = i12 % 128;
                    if (i12 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - KeyEvent.keyCodeFromString("")).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1106219560, -189573273, -756190804, 1970045181, 1225542097, -2037163726}, MotionEvent.axisFromString("") + 27).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            try {
                Iterator<jg> it = m6756().iterator();
                int i10 = f2845 + 63;
                f2844 = i10 % 128;
                int i11 = i10 % 2;
                while (true) {
                    if (!(it.hasNext())) {
                        return;
                    }
                    int i12 = f2844 + 67;
                    f2845 = i12 % 128;
                    int i13 = i12 % 2;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, -306235481, 357166782, -331477217, 720202842, 434389037, -1339251480, 10378132, -258850162}, TextUtils.lastIndexOf("", '0') + 37).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2848 == null) {
                    m6759(activity);
                }
                synchronized (this) {
                    this.f2847.put(activity, Boolean.TRUE);
                }
                Iterator<jg> it = m6756().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m6761(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - Color.blue(0)).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f2847.size() == 1 && !this.f2843) {
                        m6762(activity);
                    }
                }
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Color.alpha(0) + 30).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 997713263, 1723517344, 1225542097, -2037163726}, (-16777190) - Color.rgb(0, 0, 0)).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            try {
                Iterator<jg> it = m6756().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2843 = activity.isChangingConfigurations();
                int size = -1;
                synchronized (this) {
                    if (this.f2847.containsKey(activity) && !activity.getLocalClassName().equals(m6761(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        this.f2847.remove(activity);
                        size = this.f2847.size();
                    }
                }
                if (size < 0 || size != 0 || this.f2843) {
                    return;
                }
                m6760(activity);
            } catch (Exception e10) {
                kd.m6948(m6761(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m6761(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 2020492388, 1031454015, 1225542097, -2037163726}, 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e10, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo6753() {
            int i10 = f2844;
            int i11 = i10 + 57;
            f2845 = i11 % 128;
            int i12 = i11 % 2;
            WeakReference<Activity> weakReference = this.f2848;
            if ((weakReference != null ? 'K' : 'A') == 'A') {
                return null;
            }
            int i13 = i10 + 73;
            f2845 = i13 % 128;
            int i14 = i13 % 2;
            Activity activity = weakReference.get();
            int i15 = f2845 + 53;
            f2844 = i15 % 128;
            int i16 = i15 % 2;
            return activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized boolean mo6757() {
            int i10 = f2845 + 59;
            f2844 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2847.size();
                throw null;
            }
            if (this.f2847.size() <= 0) {
                return false;
            }
            int i11 = f2844 + 51;
            f2845 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 31 : (char) 18) == 18) {
                return true;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo6758(Application application, Activity activity) {
            if (this.f2849 == null) {
                this.f2849 = new WeakReference<>(application);
                if (activity != null) {
                    m6759(activity);
                    synchronized (this) {
                        this.f2847.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public static class e extends jj {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2851 = -238758940400250356L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2852 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2853 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Context f2854;

        private e() {
        }

        public /* synthetic */ e(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6763(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f2041) {
                f.f2039 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2040 = 0;
                while (true) {
                    int i11 = f.f2040;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2851);
                        f.f2040++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo6753() {
            int i10 = f2852 + 31;
            f2853 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return null;
            }
            int i11 = 35 / 0;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo6757() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2854.getSystemService(m6763("鉭ⓊＲ놊䣮͜햦泶", TextUtils.getCapsMode("", 0, 0) + 46757).intern())).getRunningAppProcesses();
            if (!(runningAppProcesses != null)) {
                int i10 = f2852 + 101;
                f2853 = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            String packageName = this.f2854.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    int i12 = f2852 + 117;
                    f2853 = i12 % 128;
                    int i13 = i12 % 2;
                    if (!(!runningAppProcessInfo.processName.equals(packageName))) {
                        int i14 = f2853 + 77;
                        f2852 = i14 % 128;
                        int i15 = i14 % 2;
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo6758(Application application, Activity activity) {
            int i10 = f2853 + 17;
            f2852 = i10 % 128;
            int i11 = i10 % 2;
            if (application != null) {
                this.f2854 = application.getApplicationContext();
                return;
            }
            if (!(activity == null)) {
                this.f2854 = activity.getApplicationContext();
            }
            int i12 = f2853 + 19;
            f2852 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 56 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jj m6752() {
        if (f2841 == null) {
            f2841 = new b((byte) 0);
        }
        return f2841;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract Activity mo6753();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6754(jg jgVar) {
        this.f2842.remove(jgVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m6755(jg jgVar) {
        this.f2842.add(jgVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized List<jg> m6756() {
        return new ArrayList(this.f2842);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo6757();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo6758(Application application, Activity activity);
}
