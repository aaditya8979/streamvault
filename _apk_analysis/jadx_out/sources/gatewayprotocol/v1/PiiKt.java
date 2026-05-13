package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: PiiKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class PiiKt {

    @NotNull
    public static final PiiKt INSTANCE = new PiiKt();

    /* JADX INFO: compiled from: PiiKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final PiiOuterClass.Pii.Builder _builder;

        /* JADX INFO: compiled from: PiiKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            p.j(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        @NotNull
        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            p.j(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        @NotNull
        public final String getAppsetId() {
            String appsetId = this._builder.getAppsetId();
            p.j(appsetId, "_builder.getAppsetId()");
            return appsetId;
        }

        @NotNull
        public final String getFid() {
            String fid = this._builder.getFid();
            p.j(fid, "_builder.getFid()");
            return fid;
        }

        @NotNull
        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            p.j(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        @NotNull
        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            p.j(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setAdvertisingId(byteString);
        }

        public final void setAppsetId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setAppsetId(str);
        }

        public final void setFid(@NotNull String str) {
            p.k(str, "value");
            this._builder.setFid(str);
        }

        public final void setOpenAdvertisingTrackingId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setOpenAdvertisingTrackingId(byteString);
        }

        public final void setVendorId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setVendorId(byteString);
        }
    }

    private PiiKt() {
    }
}
