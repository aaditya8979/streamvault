package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SessionChange.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SessionChange {

    /* JADX INFO: compiled from: SessionChange.kt */
    public static final class PrivacyFsmChange extends SessionChange {

        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(@NotNull ByteString byteString) {
            super(null);
            p.k(byteString, "value");
            this.value = byteString;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final PrivacyFsmChange copy(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            return new PrivacyFsmChange(byteString);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && p.f(this.value, ((PrivacyFsmChange) obj).value);
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: SessionChange.kt */
    public static final class UserConsentChange extends SessionChange {

        @NotNull
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(@NotNull ByteString byteString) {
            super(null);
            p.k(byteString, "value");
            this.value = byteString;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        @NotNull
        public final ByteString component1() {
            return this.value;
        }

        @NotNull
        public final UserConsentChange copy(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            return new UserConsentChange(byteString);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && p.f(this.value, ((UserConsentChange) obj).value);
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(i iVar) {
        this();
    }
}
