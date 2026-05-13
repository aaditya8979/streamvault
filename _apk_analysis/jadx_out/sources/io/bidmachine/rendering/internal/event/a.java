package io.bidmachine.rendering.internal.event;

import android.text.TextUtils;
import bo.d0;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.PrivacySheetParamsParser;
import io.bidmachine.util.UtilsKt;
import java.util.Arrays;
import tn.i;
import tn.p;
import tn.x;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0833a f70414c = new C0833a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f70415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70416b;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.event.a$a, reason: collision with other inner class name */
    public static final class C0833a {
        private C0833a() {
        }

        public /* synthetic */ C0833a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70417a;

        static {
            int[] iArr = new int[EventTaskType.values().length];
            try {
                iArr[EventTaskType.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventTaskType.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventTaskType.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventTaskType.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventTaskType.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventTaskType.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EventTaskType.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EventTaskType.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EventTaskType.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EventTaskType.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EventTaskType.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EventTaskType.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EventTaskType.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EventTaskType.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EventTaskType.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EventTaskType.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EventTaskType.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EventTaskType.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f70417a = iArr;
        }
    }

    public a(f fVar, String str) {
        p.k(fVar, "eventTaskExecutor");
        p.k(str, "sourceName");
        this.f70415a = fVar;
        this.f70416b = str;
    }

    private final String a(Object obj, Object... objArr) {
        String string = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(string)) {
            if (!(objArr.length == 0)) {
                Object obj2 = objArr[0];
                if (obj2 != null) {
                    return obj2.toString();
                }
                return null;
            }
        }
        return string;
    }

    private final void a(EventType eventType, EventTaskType eventTaskType) {
        b(eventType, eventTaskType);
        this.f70415a.b();
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || d0.u0(string)) {
            b(eventType, eventTaskType, "value");
            return;
        }
        PrivacySheetParams json = PrivacySheetParamsParser.parseJson(string);
        if (json == null) {
            b(eventType, eventTaskType, "value");
        } else {
            a(eventType, eventTaskType, "%s", string);
            this.f70415a.a(json);
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, Object obj, Object... objArr) {
        String strA = a(obj, Arrays.copyOf(objArr, objArr.length));
        if (strA == null || d0.u0(strA)) {
            b(eventType, eventTaskType, "notify open url");
        } else {
            a(eventType, eventTaskType, "%s", strA);
            this.f70415a.g(strA);
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.c(str);
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object obj) {
        Long longOrDefault$default;
        long jLongValue = (obj == null || (longOrDefault$default = UtilsKt.toLongOrDefault$default(obj, null, 1, null)) == null) ? Long.MIN_VALUE : longOrDefault$default.longValue();
        if (jLongValue < 0) {
            b(eventType, eventTaskType, "schedule time");
        } else {
            a(eventType, eventTaskType, "target - %s, timeMs - %s", str, Long.valueOf(jLongValue));
            this.f70415a.a(str, jLongValue);
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object obj, Object... objArr) {
        Boolean booleanOrDefault$default = UtilsKt.toBooleanOrDefault$default(obj, null, 1, null);
        if (booleanOrDefault$default == null) {
            if (!(objArr.length == 0)) {
                booleanOrDefault$default = UtilsKt.toBooleanOrDefault$default(objArr[0], null, 1, null);
            }
        }
        if (booleanOrDefault$default == null) {
            b(eventType, eventTaskType, "visibility value");
        } else {
            a(eventType, eventTaskType, "target - %s, lockVisibility - %s", str, booleanOrDefault$default);
            this.f70415a.a(str, booleanOrDefault$default.booleanValue());
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        if (o.a()) {
            if (str == null) {
                o.b("Event", "Event - " + eventType.getKey() + " (source - " + this.f70416b + "), Task - " + eventTaskType.getKey(), new Object[0]);
                return;
            }
            try {
                x xVar = x.f85368a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                p.j(str2, "format(format, *args)");
                o.b("Event", "Event - " + eventType.getKey() + " (source - " + this.f70416b + "), Task - " + eventTaskType.getKey() + " (" + str2 + ')', new Object[0]);
            } catch (Throwable th2) {
                o.b(th2);
            }
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType) {
        a(eventType, eventTaskType, (String) null, new Object[0]);
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || d0.u0(string)) {
            b(eventType, eventTaskType, "state groups value");
        } else {
            a(eventType, eventTaskType, "%s", string);
            this.f70415a.b(string);
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, Object obj, Object... objArr) {
        String strA = a(obj, Arrays.copyOf(objArr, objArr.length));
        if (strA == null || d0.u0(strA)) {
            b(eventType, eventTaskType, "open url");
        } else {
            a(eventType, eventTaskType, "%s", strA);
            this.f70415a.e(strA);
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str) {
        o.a("Event", "Could not find required params (" + str + ") for execute task (" + eventType + ", " + eventTaskType + ')', new Object[0]);
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return;
        }
        a(eventType, eventTaskType, "target - %s, value - %s", str, string);
        this.f70415a.a(str, string);
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object obj, Object... objArr) {
        try {
            switch (b.f70417a[eventTaskType.ordinal()]) {
                case 1:
                    c(eventType, eventTaskType, obj);
                    break;
                case 2:
                    b(eventType, eventTaskType, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 3:
                    a(eventType, eventTaskType, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 4:
                    c(eventType, eventTaskType);
                    break;
                case 5:
                    a(eventType, eventTaskType);
                    break;
                case 6:
                    c(eventType, eventTaskType, str);
                    break;
                case 7:
                    h(eventType, eventTaskType, str);
                    break;
                case 8:
                    d(eventType, eventTaskType, str);
                    break;
                case 9:
                    e(eventType, eventTaskType, str);
                    break;
                case 10:
                    a(eventType, eventTaskType, str);
                    break;
                case 11:
                    b(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 12:
                    a(eventType, eventTaskType, str, obj);
                    break;
                case 13:
                    b(eventType, eventTaskType, str, obj);
                    break;
                case 14:
                    a(eventType, eventTaskType, str, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 15:
                    g(eventType, eventTaskType, str);
                    break;
                case 16:
                    f(eventType, eventTaskType, str);
                    break;
                case 17:
                    a(eventType, eventTaskType, obj);
                    break;
                case 18:
                    b(eventType, eventTaskType, obj);
                    break;
            }
        } catch (Throwable th2) {
            o.b(th2);
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        if (objArr.length < 2) {
            b(eventType, eventTaskType, "progress parameters");
            return;
        }
        Long longOrDefault$default = UtilsKt.toLongOrDefault$default(objArr[0], null, 1, null);
        long jLongValue = longOrDefault$default != null ? longOrDefault$default.longValue() : Long.MIN_VALUE;
        Long longOrDefault$default2 = UtilsKt.toLongOrDefault$default(objArr[1], null, 1, null);
        long jLongValue2 = longOrDefault$default2 != null ? longOrDefault$default2.longValue() : Long.MIN_VALUE;
        if (jLongValue < 1 || jLongValue2 < 0) {
            b(eventType, eventTaskType, "maxProgressMs, currentProgressMs");
        } else {
            this.f70415a.a(str, jLongValue, jLongValue2, (jLongValue2 * 100.0f) / jLongValue);
        }
    }

    private final void c(EventType eventType, EventTaskType eventTaskType) {
        b(eventType, eventTaskType);
        this.f70415a.e();
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || d0.u0(string)) {
            b(eventType, eventTaskType, "track url");
        } else {
            a(eventType, eventTaskType, "%s", string);
            this.f70415a.j(string);
        }
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.d(str);
    }

    private final void d(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.f(str);
    }

    private final void e(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.a(str);
    }

    private final void f(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.i(str);
    }

    private final void g(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.h(str);
    }

    private final void h(EventType eventType, EventTaskType eventTaskType, String str) {
        a(eventType, eventTaskType, "target - %s", str);
        this.f70415a.k(str);
    }

    @Override // io.bidmachine.rendering.internal.event.d
    public void a(EventType eventType, EventTaskParams eventTaskParams, Object... objArr) {
        p.k(eventType, "eventType");
        p.k(eventTaskParams, "eventTaskParams");
        p.k(objArr, "params");
        b(eventType, eventTaskParams.getEventTaskType(), eventTaskParams.getTarget(), eventTaskParams.getValue(), Arrays.copyOf(objArr, objArr.length));
    }
}
