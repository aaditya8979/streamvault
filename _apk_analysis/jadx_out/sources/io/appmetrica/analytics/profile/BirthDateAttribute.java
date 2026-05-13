package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4648a8;
import io.appmetrica.analytics.impl.C4674b8;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.C5294zl;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.K2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Zm;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68343a = new C5154u6("appmetrica_birth_date", new C4674b8(), new C5294zl());

    public final UserProfileUpdate a(Calendar calendar, String str, K2 k22) {
        return new UserProfileUpdate(new Zm(this.f68343a.f67772c, new SimpleDateFormat(str).format(calendar.getTime()), new C4648a8(), new C4674b8(), k22));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withAge(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new C5127t4(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withAgeIfUndefined(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new Yk(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDate(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C5127t4(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDate(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C5127t4(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDate(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new C5127t4(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C5127t4(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDateIfUndefined(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new Yk(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDateIfUndefined(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Yk(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDateIfUndefined(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new Yk(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Yk(this.f68343a.f67771b));
    }

    public UserProfileUpdate<? extends InterfaceC4793fo> withValueReset() {
        return new UserProfileUpdate<>(new Ci(0, this.f68343a.f67772c, new C4674b8(), new C5294zl()));
    }
}
