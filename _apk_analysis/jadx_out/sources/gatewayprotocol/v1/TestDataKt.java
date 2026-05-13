package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TestDataOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TestDataKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TestDataKt {

    @NotNull
    public static final TestDataKt INSTANCE = new TestDataKt();

    /* JADX INFO: compiled from: TestDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final TestDataOuterClass.TestData.Builder _builder;

        /* JADX INFO: compiled from: TestDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData testDataBuild = this._builder.build();
            p.j(testDataBuild, "_builder.build()");
            return testDataBuild;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        @NotNull
        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            p.j(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        @NotNull
        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            p.j(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        @NotNull
        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            p.j(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setForceCampaignId(str);
        }

        public final void setForceCountry(@NotNull String str) {
            p.k(str, "value");
            this._builder.setForceCountry(str);
        }

        public final void setForceCountrySubdivision(@NotNull String str) {
            p.k(str, "value");
            this._builder.setForceCountrySubdivision(str);
        }

        public final void setForceExchangeTestMode(int i10) {
            this._builder.setForceExchangeTestMode(i10);
        }
    }

    private TestDataKt() {
    }
}
