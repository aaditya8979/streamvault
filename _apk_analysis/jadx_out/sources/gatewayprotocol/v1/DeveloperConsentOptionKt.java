package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DeveloperConsentOptionKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DeveloperConsentOptionKt {

    @NotNull
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    /* JADX INFO: compiled from: DeveloperConsentOptionKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        /* JADX INFO: compiled from: DeveloperConsentOptionKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionBuild = this._builder.build();
            p.j(developerConsentOptionBuild, "_builder.build()");
            return developerConsentOptionBuild;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            p.j(customType, "_builder.getCustomType()");
            return customType;
        }

        @NotNull
        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            p.j(type, "_builder.getType()");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        @NotNull
        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            p.j(value, "_builder.getValue()");
            return value;
        }

        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final void setCustomType(@NotNull String str) {
            p.k(str, "value");
            this._builder.setCustomType(str);
        }

        public final void setType(@NotNull DeveloperConsentOuterClass.DeveloperConsentType developerConsentType) {
            p.k(developerConsentType, "value");
            this._builder.setType(developerConsentType);
        }

        public final void setTypeValue(int i10) {
            this._builder.setTypeValue(i10);
        }

        public final void setValue(@NotNull DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoice) {
            p.k(developerConsentChoice, "value");
            this._builder.setValue(developerConsentChoice);
        }

        public final void setValueValue(int i10) {
            this._builder.setValueValue(i10);
        }
    }

    private DeveloperConsentOptionKt() {
    }
}
