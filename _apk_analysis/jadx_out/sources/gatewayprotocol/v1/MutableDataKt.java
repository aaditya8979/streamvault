package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MutableDataKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class MutableDataKt {

    @NotNull
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    /* JADX INFO: compiled from: MutableDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final MutableDataOuterClass.MutableData.Builder _builder;

        /* JADX INFO: compiled from: MutableDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData mutableDataBuild = this._builder.build();
            p.j(mutableDataBuild, "_builder.build()");
            return mutableDataBuild;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        @NotNull
        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            p.j(allowedPii, "_builder.getAllowedPii()");
            return allowedPii;
        }

        @Nullable
        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            p.j(cache, "_builder.getCache()");
            return cache;
        }

        @NotNull
        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            p.j(currentState, "_builder.getCurrentState()");
            return currentState;
        }

        @NotNull
        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            p.j(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        @NotNull
        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            p.j(privacyFsm, "_builder.getPrivacyFsm()");
            return privacyFsm;
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            p.j(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @Nullable
        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            p.j(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(@NotNull AllowedPiiOuterClass.AllowedPii allowedPii) {
            p.k(allowedPii, "value");
            this._builder.setAllowedPii(allowedPii);
        }

        public final void setCache(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setCache(byteString);
        }

        public final void setCurrentState(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setCurrentState(byteString);
        }

        public final void setPrivacy(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setPrivacy(byteString);
        }

        public final void setPrivacyFsm(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setPrivacyFsm(byteString);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters) {
            p.k(sessionCounters, "value");
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setSessionToken(byteString);
        }
    }

    private MutableDataKt() {
    }
}
