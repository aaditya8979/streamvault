package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4648a8;
import io.appmetrica.analytics.impl.C4674b8;
import io.appmetrica.analytics.impl.C5127t4;
import io.appmetrica.analytics.impl.C5154u6;
import io.appmetrica.analytics.impl.C5294zl;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Zm;

/* JADX INFO: loaded from: classes.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5154u6 f68352a = new C5154u6("appmetrica_gender", new C4674b8(), new C5294zl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f68354a;

        Gender(String str) {
            this.f68354a = str;
        }

        public String getStringValue() {
            return this.f68354a;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValue(@NonNull Gender gender) {
        String str = this.f68352a.f67772c;
        String stringValue = gender.getStringValue();
        C4648a8 c4648a8 = new C4648a8();
        C5154u6 c5154u6 = this.f68352a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c4648a8, c5154u6.f67770a, new C5127t4(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f68352a.f67772c;
        String stringValue = gender.getStringValue();
        C4648a8 c4648a8 = new C4648a8();
        C5154u6 c5154u6 = this.f68352a;
        return new UserProfileUpdate<>(new Zm(str, stringValue, c4648a8, c5154u6.f67770a, new Yk(c5154u6.f67771b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC4793fo> withValueReset() {
        C5154u6 c5154u6 = this.f68352a;
        return new UserProfileUpdate<>(new Ci(0, c5154u6.f67772c, c5154u6.f67770a, c5154u6.f67771b));
    }
}
