package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes.dex */
public final class BidToken$ClientBidTokenComponents extends GeneratedMessageLite<BidToken$ClientBidTokenComponents, c> implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_INFO_FIELD_NUMBER = 11;
    public static final int AD_INFO_FIELD_NUMBER = 8;
    public static final int AUDIO_INFO_FIELD_NUMBER = 10;
    public static final int BATTERY_INFO_FIELD_NUMBER = 9;
    private static final BidToken$ClientBidTokenComponents DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int DIR_INFO_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 1;
    public static final int IMP_LVL_REV_DATA_FIELD_NUMBER = 12;
    public static final int INFO_FIELD_NUMBER = 4;
    public static final int MEMORY_INFO_FIELD_NUMBER = 5;
    public static final int NETWORK_INFO_FIELD_NUMBER = 7;
    private static volatile Parser<BidToken$ClientBidTokenComponents> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 2;
    public static final int TEST_CONFIG_FIELD_NUMBER = 13;
    private a accessibilityInfo_;
    private b adInfo_;
    private AudioInfo audioInfo_;
    private BatteryInfo batteryInfo_;
    private int bitField0_;
    private Device device_;
    private d dirInfo_;
    private String idfv_ = "";
    private f impLvlRevData_;
    private j info_;
    private g memoryInfo_;
    private NetworkInfo networkInfo_;
    private i privacy_;
    private k testConfig_;

    public static final class AudioInfo extends GeneratedMessageLite<AudioInfo, a> implements MessageLiteOrBuilder {
        private static final AudioInfo DEFAULT_INSTANCE;
        public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
        private static volatile Parser<AudioInfo> PARSER = null;
        public static final int VOL_FIELD_NUMBER = 2;
        private int bitField0_;
        private int muteSwitch_;
        private int vol_;

        public enum MuteSwitchState implements Internal.EnumLite {
            SILENT(0),
            VIBRATE(1),
            NORMAL(2),
            UNRECOGNIZED(-1);

            public static final int NORMAL_VALUE = 2;
            public static final int SILENT_VALUE = 0;
            public static final int VIBRATE_VALUE = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<MuteSwitchState> f45674b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<MuteSwitchState> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public MuteSwitchState findValueByNumber(int i10) {
                    return MuteSwitchState.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45676a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return MuteSwitchState.forNumber(i10) != null;
                }
            }

            MuteSwitchState(int i10) {
                this.value = i10;
            }

            public static MuteSwitchState forNumber(int i10) {
                if (i10 == 0) {
                    return SILENT;
                }
                if (i10 == 1) {
                    return VIBRATE;
                }
                if (i10 != 2) {
                    return null;
                }
                return NORMAL;
            }

            public static Internal.EnumLiteMap<MuteSwitchState> internalGetValueMap() {
                return f45674b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45676a;
            }

            @Deprecated
            public static MuteSwitchState valueOf(int i10) {
                return forNumber(i10);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<AudioInfo, a> implements MessageLiteOrBuilder {
            public a() {
                super(AudioInfo.DEFAULT_INSTANCE);
            }

            public a a(MuteSwitchState muteSwitchState) {
                copyOnWrite();
                ((AudioInfo) this.instance).e(muteSwitchState);
                return this;
            }

            public a b(int i10) {
                copyOnWrite();
                ((AudioInfo) this.instance).f(i10);
                return this;
            }
        }

        static {
            AudioInfo audioInfo = new AudioInfo();
            DEFAULT_INSTANCE = audioInfo;
            GeneratedMessageLite.registerDefaultInstance(AudioInfo.class, audioInfo);
        }

        public static a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudioInfo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "muteSwitch_", "vol_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AudioInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AudioInfo.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void e(MuteSwitchState muteSwitchState) {
            this.muteSwitch_ = muteSwitchState.getNumber();
            this.bitField0_ |= 1;
        }

        public final void f(int i10) {
            this.bitField0_ |= 2;
            this.vol_ = i10;
        }
    }

    public static final class BatteryInfo extends GeneratedMessageLite<BatteryInfo, a> implements MessageLiteOrBuilder {
        public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
        private static final BatteryInfo DEFAULT_INSTANCE;
        public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
        public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
        private static volatile Parser<BatteryInfo> PARSER;
        private int batteryStatus_;
        private int bitField0_;
        private boolean lowPowMode_;
        private int maxBatteryLevel_;

        public enum BatteryStatus implements Internal.EnumLite {
            UNKNOWN(0),
            CHARGING(1),
            DISCHARGING(2),
            NOT_CHARGING(3),
            FULL(4),
            UNRECOGNIZED(-1);

            public static final int CHARGING_VALUE = 1;
            public static final int DISCHARGING_VALUE = 2;
            public static final int FULL_VALUE = 4;
            public static final int NOT_CHARGING_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<BatteryStatus> f45677b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<BatteryStatus> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public BatteryStatus findValueByNumber(int i10) {
                    return BatteryStatus.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45679a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return BatteryStatus.forNumber(i10) != null;
                }
            }

            BatteryStatus(int i10) {
                this.value = i10;
            }

            public static BatteryStatus forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return CHARGING;
                }
                if (i10 == 2) {
                    return DISCHARGING;
                }
                if (i10 == 3) {
                    return NOT_CHARGING;
                }
                if (i10 != 4) {
                    return null;
                }
                return FULL;
            }

            public static Internal.EnumLiteMap<BatteryStatus> internalGetValueMap() {
                return f45677b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45679a;
            }

            @Deprecated
            public static BatteryStatus valueOf(int i10) {
                return forNumber(i10);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<BatteryInfo, a> implements MessageLiteOrBuilder {
            public a() {
                super(BatteryInfo.DEFAULT_INSTANCE);
            }

            public a a(BatteryStatus batteryStatus) {
                copyOnWrite();
                ((BatteryInfo) this.instance).f(batteryStatus);
                return this;
            }

            public a b(boolean z10) {
                copyOnWrite();
                ((BatteryInfo) this.instance).g(z10);
                return this;
            }

            public a c(int i10) {
                copyOnWrite();
                ((BatteryInfo) this.instance).h(i10);
                return this;
            }
        }

        static {
            BatteryInfo batteryInfo = new BatteryInfo();
            DEFAULT_INSTANCE = batteryInfo;
            GeneratedMessageLite.registerDefaultInstance(BatteryInfo.class, batteryInfo);
        }

        public static a e() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BatteryInfo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BatteryInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BatteryInfo.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void f(BatteryStatus batteryStatus) {
            this.batteryStatus_ = batteryStatus.getNumber();
            this.bitField0_ |= 2;
        }

        public final void g(boolean z10) {
            this.bitField0_ |= 4;
            this.lowPowMode_ = z10;
        }

        public final void h(int i10) {
            this.bitField0_ |= 1;
            this.maxBatteryLevel_ = i10;
        }
    }

    public static final class Device extends GeneratedMessageLite<Device, a> implements MessageLiteOrBuilder {
        public static final int BRAND_FIELD_NUMBER = 23;
        public static final int CARRIER_FIELD_NUMBER = 6;
        public static final int DBT_FIELD_NUMBER = 15;
        private static final Device DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 7;
        public static final int GEO_FIELD_NUMBER = 9;
        public static final int HARDWARE_FIELD_NUMBER = 22;
        public static final int HAS_GY_FIELD_NUMBER = 17;
        public static final int HWV_FIELD_NUMBER = 5;
        public static final int H_FIELD_NUMBER = 11;
        public static final int JS_FIELD_NUMBER = 8;
        public static final int KB_LOC_FIELD_NUMBER = 18;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LOCALE_FIELD_NUMBER = 19;
        public static final int MAKE_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 4;
        public static final int ORTN_FIELD_NUMBER = 16;
        public static final int OSV_FIELD_NUMBER = 2;
        public static final int OS_FIELD_NUMBER = 14;
        private static volatile Parser<Device> PARSER = null;
        public static final int PPI_FIELD_NUMBER = 12;
        public static final int PXRATIO_FIELD_NUMBER = 13;
        public static final int W_FIELD_NUMBER = 10;
        public static final int XDPI_FIELD_NUMBER = 20;
        public static final int YDPI_FIELD_NUMBER = 21;
        private int bitField0_;
        private long dbt_;
        private int devicetype_;
        private e geo_;
        private int h_;
        private boolean hasGy_;
        private int js_;
        private int ortn_;
        private int ppi_;
        private double pxratio_;
        private int w_;
        private float xdpi_;
        private float ydpi_;
        private String language_ = "";
        private String osv_ = "";
        private String make_ = "";
        private String model_ = "";
        private String hwv_ = "";
        private String carrier_ = "";
        private String os_ = "";
        private String kbLoc_ = "";
        private String locale_ = "";
        private String hardware_ = "";
        private String brand_ = "";

        public enum Orientation implements Internal.EnumLite {
            UNKNOWN(0),
            PORTRAIT(1),
            LANDSCAPE(2),
            UNRECOGNIZED(-1);

            public static final int LANDSCAPE_VALUE = 2;
            public static final int PORTRAIT_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<Orientation> f45680b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<Orientation> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Orientation findValueByNumber(int i10) {
                    return Orientation.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45682a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return Orientation.forNumber(i10) != null;
                }
            }

            Orientation(int i10) {
                this.value = i10;
            }

            public static Orientation forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return PORTRAIT;
                }
                if (i10 != 2) {
                    return null;
                }
                return LANDSCAPE;
            }

            public static Internal.EnumLiteMap<Orientation> internalGetValueMap() {
                return f45680b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45682a;
            }

            @Deprecated
            public static Orientation valueOf(int i10) {
                return forNumber(i10);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<Device, a> implements MessageLiteOrBuilder {
            public a() {
                super(Device.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((Device) this.instance).z(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((Device) this.instance).A(str);
                return this;
            }

            public a c(long j10) {
                copyOnWrite();
                ((Device) this.instance).B(j10);
                return this;
            }

            public a d(int i10) {
                copyOnWrite();
                ((Device) this.instance).C(i10);
                return this;
            }

            public a e(e eVar) {
                copyOnWrite();
                ((Device) this.instance).D(eVar);
                return this;
            }

            public a f(int i10) {
                copyOnWrite();
                ((Device) this.instance).E(i10);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((Device) this.instance).F(str);
                return this;
            }

            public a h(boolean z10) {
                copyOnWrite();
                ((Device) this.instance).G(z10);
                return this;
            }

            public a i(String str) {
                copyOnWrite();
                ((Device) this.instance).H(str);
                return this;
            }

            public a j(int i10) {
                copyOnWrite();
                ((Device) this.instance).I(i10);
                return this;
            }

            public a k(String str) {
                copyOnWrite();
                ((Device) this.instance).J(str);
                return this;
            }

            public a l(String str) {
                copyOnWrite();
                ((Device) this.instance).setLanguage(str);
                return this;
            }

            public a m(String str) {
                copyOnWrite();
                ((Device) this.instance).K(str);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                ((Device) this.instance).setMake(str);
                return this;
            }

            public a o(String str) {
                copyOnWrite();
                ((Device) this.instance).setModel(str);
                return this;
            }

            public a p(Orientation orientation) {
                copyOnWrite();
                ((Device) this.instance).L(orientation);
                return this;
            }

            public a q(String str) {
                copyOnWrite();
                ((Device) this.instance).setOs(str);
                return this;
            }

            public a r(String str) {
                copyOnWrite();
                ((Device) this.instance).M(str);
                return this;
            }

            public a s(int i10) {
                copyOnWrite();
                ((Device) this.instance).N(i10);
                return this;
            }

            public a t(double d10) {
                copyOnWrite();
                ((Device) this.instance).O(d10);
                return this;
            }

            public a u(int i10) {
                copyOnWrite();
                ((Device) this.instance).P(i10);
                return this;
            }

            public a v(float f10) {
                copyOnWrite();
                ((Device) this.instance).Q(f10);
                return this;
            }

            public a w(float f10) {
                copyOnWrite();
                ((Device) this.instance).R(f10);
                return this;
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        public static a y() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void A(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.carrier_ = str;
        }

        public final void B(long j10) {
            this.bitField0_ |= 16384;
            this.dbt_ = j10;
        }

        public final void C(int i10) {
            this.bitField0_ |= 64;
            this.devicetype_ = i10;
        }

        public final void D(e eVar) {
            eVar.getClass();
            this.geo_ = eVar;
            this.bitField0_ |= 256;
        }

        public final void E(int i10) {
            this.bitField0_ |= 1024;
            this.h_ = i10;
        }

        public final void F(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.hardware_ = str;
        }

        public final void G(boolean z10) {
            this.bitField0_ |= 65536;
            this.hasGy_ = z10;
        }

        public final void H(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.hwv_ = str;
        }

        public final void I(int i10) {
            this.bitField0_ |= 128;
            this.js_ = i10;
        }

        public final void J(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.kbLoc_ = str;
        }

        public final void K(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.locale_ = str;
        }

        public final void L(Orientation orientation) {
            this.ortn_ = orientation.getNumber();
            this.bitField0_ |= 32768;
        }

        public final void M(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.osv_ = str;
        }

        public final void N(int i10) {
            this.bitField0_ |= 2048;
            this.ppi_ = i10;
        }

        public final void O(double d10) {
            this.bitField0_ |= 4096;
            this.pxratio_ = d10;
        }

        public final void P(int i10) {
            this.bitField0_ |= 512;
            this.w_ = i10;
        }

        public final void Q(float f10) {
            this.bitField0_ |= 524288;
            this.xdpi_ = f10;
        }

        public final void R(float f10) {
            this.bitField0_ |= 1048576;
            this.ydpi_ = f10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Device> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Device.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.language_ = str;
        }

        public final void setMake(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.make_ = str;
        }

        public final void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.model_ = str;
        }

        public final void setOs(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.os_ = str;
        }

        public final void z(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.brand_ = str;
        }
    }

    public static final class NetworkInfo extends GeneratedMessageLite<NetworkInfo, a> implements h {
        private static final NetworkInfo DEFAULT_INSTANCE;
        public static final int MCC_FIELD_NUMBER = 3;
        public static final int MNC_FIELD_NUMBER = 4;
        private static volatile Parser<NetworkInfo> PARSER = null;
        public static final int RESTRICTED_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int mcc_;
        private int mnc_;
        private boolean restricted_;
        private int type_;

        public enum ConnectionType implements Internal.EnumLite {
            UNKNOWN(0),
            WIFI(1),
            CELLULAR(2),
            NO_NETWORK(3),
            UNRECOGNIZED(-1);

            public static final int CELLULAR_VALUE = 2;
            public static final int NO_NETWORK_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;
            public static final int WIFI_VALUE = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<ConnectionType> f45683b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<ConnectionType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ConnectionType findValueByNumber(int i10) {
                    return ConnectionType.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45685a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return ConnectionType.forNumber(i10) != null;
                }
            }

            ConnectionType(int i10) {
                this.value = i10;
            }

            public static ConnectionType forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return WIFI;
                }
                if (i10 == 2) {
                    return CELLULAR;
                }
                if (i10 != 3) {
                    return null;
                }
                return NO_NETWORK;
            }

            public static Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
                return f45683b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45685a;
            }

            @Deprecated
            public static ConnectionType valueOf(int i10) {
                return forNumber(i10);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<NetworkInfo, a> implements h {
            public a() {
                super(NetworkInfo.DEFAULT_INSTANCE);
            }

            public a a(int i10) {
                copyOnWrite();
                ((NetworkInfo) this.instance).g(i10);
                return this;
            }

            public a b(int i10) {
                copyOnWrite();
                ((NetworkInfo) this.instance).h(i10);
                return this;
            }

            public a c(boolean z10) {
                copyOnWrite();
                ((NetworkInfo) this.instance).i(z10);
                return this;
            }

            public a d(ConnectionType connectionType) {
                copyOnWrite();
                ((NetworkInfo) this.instance).j(connectionType);
                return this;
            }

            @Override // com.moloco.sdk.BidToken$ClientBidTokenComponents.h
            public ConnectionType getType() {
                return ((NetworkInfo) this.instance).getType();
            }
        }

        static {
            NetworkInfo networkInfo = new NetworkInfo();
            DEFAULT_INSTANCE = networkInfo;
            GeneratedMessageLite.registerDefaultInstance(NetworkInfo.class, networkInfo);
        }

        public static a f() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NetworkInfo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "type_", "restricted_", "mcc_", "mnc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NetworkInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NetworkInfo.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void g(int i10) {
            this.bitField0_ |= 4;
            this.mcc_ = i10;
        }

        @Override // com.moloco.sdk.BidToken$ClientBidTokenComponents.h
        public ConnectionType getType() {
            ConnectionType connectionTypeForNumber = ConnectionType.forNumber(this.type_);
            return connectionTypeForNumber == null ? ConnectionType.UNRECOGNIZED : connectionTypeForNumber;
        }

        public final void h(int i10) {
            this.bitField0_ |= 8;
            this.mnc_ = i10;
        }

        public final void i(boolean z10) {
            this.bitField0_ |= 2;
            this.restricted_ = z10;
        }

        public final void j(ConnectionType connectionType) {
            this.type_ = connectionType.getNumber();
            this.bitField0_ |= 1;
        }
    }

    public static final class a extends GeneratedMessageLite<a, C0549a> implements MessageLiteOrBuilder {
        public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
        public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
        private static final a DEFAULT_INSTANCE;
        public static final int FONT_SCALE_FIELD_NUMBER = 4;
        private static volatile Parser<a> PARSER = null;
        public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
        private boolean accessibilityCaptioningEnabled_;
        private boolean accessibilityLargePointerIcon_;
        private int bitField0_;
        private float fontScale_;
        private boolean reduceBrightColorsActivated_;

        /* JADX INFO: renamed from: com.moloco.sdk.BidToken$ClientBidTokenComponents$a$a, reason: collision with other inner class name */
        public static final class C0549a extends GeneratedMessageLite.Builder<a, C0549a> implements MessageLiteOrBuilder {
            public C0549a() {
                super(a.DEFAULT_INSTANCE);
            }

            public C0549a a(boolean z10) {
                copyOnWrite();
                ((a) this.instance).g(z10);
                return this;
            }

            public C0549a b(boolean z10) {
                copyOnWrite();
                ((a) this.instance).h(z10);
                return this;
            }

            public C0549a c(float f10) {
                copyOnWrite();
                ((a) this.instance).i(f10);
                return this;
            }

            public C0549a d(boolean z10) {
                copyOnWrite();
                ((a) this.instance).j(z10);
                return this;
            }
        }

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        public static C0549a f() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0549a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "accessibilityCaptioningEnabled_", "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<a> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (a.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void g(boolean z10) {
            this.bitField0_ |= 1;
            this.accessibilityCaptioningEnabled_ = z10;
        }

        public final void h(boolean z10) {
            this.bitField0_ |= 2;
            this.accessibilityLargePointerIcon_ = z10;
        }

        public final void i(float f10) {
            this.bitField0_ |= 8;
            this.fontScale_ = f10;
        }

        public final void j(boolean z10) {
            this.bitField0_ |= 4;
            this.reduceBrightColorsActivated_ = z10;
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        private static final b DEFAULT_INSTANCE;
        public static final int DNT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<b> PARSER;
        private int bitField0_;
        private boolean dnt_;
        private String id_ = "";

        public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }

            public a a(boolean z10) {
                copyOnWrite();
                ((b) this.instance).e(z10);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((b) this.instance).f(str);
                return this;
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        public static a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "dnt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<b> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (b.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void e(boolean z10) {
            this.bitField0_ |= 2;
            this.dnt_ = z10;
        }

        public final void f(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }
    }

    public static final class c extends GeneratedMessageLite.Builder<BidToken$ClientBidTokenComponents, c> implements MessageLiteOrBuilder {
        public c() {
            super(BidToken$ClientBidTokenComponents.DEFAULT_INSTANCE);
        }

        public c a(a aVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).o(aVar);
            return this;
        }

        public c b(b bVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).p(bVar);
            return this;
        }

        public c c(AudioInfo audioInfo) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).q(audioInfo);
            return this;
        }

        public c d(BatteryInfo batteryInfo) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).r(batteryInfo);
            return this;
        }

        public c e(Device device) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).s(device);
            return this;
        }

        public c f(d dVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).t(dVar);
            return this;
        }

        public c g(f fVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).u(fVar);
            return this;
        }

        public c h(j jVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).v(jVar);
            return this;
        }

        public c i(g gVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).w(gVar);
            return this;
        }

        public c j(NetworkInfo networkInfo) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).x(networkInfo);
            return this;
        }

        public c k(i iVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).y(iVar);
            return this;
        }

        public c l(k kVar) {
            copyOnWrite();
            ((BidToken$ClientBidTokenComponents) this.instance).z(kVar);
            return this;
        }
    }

    public static final class d extends GeneratedMessageLite<d, a> implements MessageLiteOrBuilder {
        private static final d DEFAULT_INSTANCE;
        public static final int DSIZE_BYTES_FIELD_NUMBER = 1;
        private static volatile Parser<d> PARSER;
        private int bitField0_;
        private long dsizeBytes_;

        public static final class a extends GeneratedMessageLite.Builder<d, a> implements MessageLiteOrBuilder {
            public a() {
                super(d.DEFAULT_INSTANCE);
            }

            public a a(long j10) {
                copyOnWrite();
                ((d) this.instance).d(j10);
                return this;
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(long j10) {
            this.bitField0_ |= 1;
            this.dsizeBytes_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"bitField0_", "dsizeBytes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<d> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (d.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e extends GeneratedMessageLite<e, a> implements MessageLiteOrBuilder {
        private static final e DEFAULT_INSTANCE;
        private static volatile Parser<e> PARSER = null;
        public static final int UTCOFFSET_FIELD_NUMBER = 1;
        private int bitField0_;
        private int utcoffset_;

        public static final class a extends GeneratedMessageLite.Builder<e, a> implements MessageLiteOrBuilder {
            public a() {
                super(e.DEFAULT_INSTANCE);
            }

            public a a(int i10) {
                copyOnWrite();
                ((e) this.instance).d(i10);
                return this;
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(int i10) {
            this.bitField0_ |= 1;
            this.utcoffset_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "utcoffset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<e> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (e.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class f extends GeneratedMessageLite<f, a> implements MessageLiteOrBuilder {
        private static final f DEFAULT_INSTANCE;
        public static final int IMP_COUNTS_FIELD_NUMBER = 4;
        public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
        private static volatile Parser<f> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_START_TS_FIELD_NUMBER = 3;
        private b impCounts_;
        private long lastImpTs_;
        private String sessionId_ = "";
        private long sessionStartTs_;

        public static final class a extends GeneratedMessageLite.Builder<f, a> implements MessageLiteOrBuilder {
            public a() {
                super(f.DEFAULT_INSTANCE);
            }

            public a a(b bVar) {
                copyOnWrite();
                ((f) this.instance).g(bVar);
                return this;
            }

            public a b(long j10) {
                copyOnWrite();
                ((f) this.instance).h(j10);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((f) this.instance).setSessionId(str);
                return this;
            }

            public a d(long j10) {
                copyOnWrite();
                ((f) this.instance).i(j10);
                return this;
            }
        }

        public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
            public static final int BANNER_FIELD_NUMBER = 4;
            private static final b DEFAULT_INSTANCE;
            public static final int INTERSTITIAL_FIELD_NUMBER = 1;
            public static final int MREC_FIELD_NUMBER = 3;
            public static final int NATIVE_FIELD_NUMBER = 5;
            private static volatile Parser<b> PARSER = null;
            public static final int REWARDED_FIELD_NUMBER = 2;
            private int banner_;
            private int interstitial_;
            private int mrec_;
            private int native_;
            private int rewarded_;

            public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
                public a() {
                    super(b.DEFAULT_INSTANCE);
                }

                public a a(int i10) {
                    copyOnWrite();
                    ((b) this.instance).h(i10);
                    return this;
                }

                public a b(int i10) {
                    copyOnWrite();
                    ((b) this.instance).i(i10);
                    return this;
                }

                public a c(int i10) {
                    copyOnWrite();
                    ((b) this.instance).j(i10);
                    return this;
                }

                public a d(int i10) {
                    copyOnWrite();
                    ((b) this.instance).k(i10);
                    return this;
                }

                public a e(int i10) {
                    copyOnWrite();
                    ((b) this.instance).l(i10);
                    return this;
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
            }

            public static a g() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<b> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (b.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                                break;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public final void h(int i10) {
                this.banner_ = i10;
            }

            public final void i(int i10) {
                this.interstitial_ = i10;
            }

            public final void j(int i10) {
                this.mrec_ = i10;
            }

            public final void k(int i10) {
                this.native_ = i10;
            }

            public final void l(int i10) {
                this.rewarded_ = i10;
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        public static a f() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<f> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (f.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void g(b bVar) {
            bVar.getClass();
            this.impCounts_ = bVar;
        }

        public final void h(long j10) {
            this.lastImpTs_ = j10;
        }

        public final void i(long j10) {
            this.sessionStartTs_ = j10;
        }

        public final void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }
    }

    public static final class g extends GeneratedMessageLite<g, a> implements MessageLiteOrBuilder {
        private static final g DEFAULT_INSTANCE;
        public static final int LOW_MEM_FIELD_NUMBER = 1;
        public static final int LOW_MEM_THRESHOLD_BYTES_FIELD_NUMBER = 2;
        private static volatile Parser<g> PARSER = null;
        public static final int TOTAL_MEM_BYTES_FIELD_NUMBER = 3;
        private int bitField0_;
        private long lowMemThresholdBytes_;
        private boolean lowMem_;
        private long totalMemBytes_;

        public static final class a extends GeneratedMessageLite.Builder<g, a> implements MessageLiteOrBuilder {
            public a() {
                super(g.DEFAULT_INSTANCE);
            }

            public a a(boolean z10) {
                copyOnWrite();
                ((g) this.instance).f(z10);
                return this;
            }

            public a b(long j10) {
                copyOnWrite();
                ((g) this.instance).g(j10);
                return this;
            }

            public a c(long j10) {
                copyOnWrite();
                ((g) this.instance).h(j10);
                return this;
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
        }

        public static a e() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "lowMem_", "lowMemThresholdBytes_", "totalMemBytes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<g> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (g.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void f(boolean z10) {
            this.bitField0_ |= 1;
            this.lowMem_ = z10;
        }

        public final void g(long j10) {
            this.bitField0_ |= 2;
            this.lowMemThresholdBytes_ = j10;
        }

        public final void h(long j10) {
            this.bitField0_ |= 4;
            this.totalMemBytes_ = j10;
        }
    }

    public interface h extends MessageLiteOrBuilder {
        NetworkInfo.ConnectionType getType();
    }

    public static final class i extends GeneratedMessageLite<i, a> implements MessageLiteOrBuilder {
        public static final int CCPA_FIELD_NUMBER = 1;
        public static final int COPPA_FIELD_NUMBER = 3;
        private static final i DEFAULT_INSTANCE;
        public static final int GDPR_FIELD_NUMBER = 2;
        private static volatile Parser<i> PARSER = null;
        public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
        public static final int US_PRIVACY_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean ccpa_;
        private boolean coppa_;
        private boolean gdpr_;
        private String usPrivacy_ = "";
        private String tcfConsentString_ = "";

        public static final class a extends GeneratedMessageLite.Builder<i, a> implements MessageLiteOrBuilder {
            public a() {
                super(i.DEFAULT_INSTANCE);
            }

            public a a(boolean z10) {
                copyOnWrite();
                ((i) this.instance).h(z10);
                return this;
            }

            public a b(boolean z10) {
                copyOnWrite();
                ((i) this.instance).i(z10);
                return this;
            }

            public a c(boolean z10) {
                copyOnWrite();
                ((i) this.instance).j(z10);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((i) this.instance).k(str);
                return this;
            }

            public a e(String str) {
                copyOnWrite();
                ((i) this.instance).l(str);
                return this;
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
        }

        public static a g() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<i> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (i.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final void h(boolean z10) {
            this.bitField0_ |= 1;
            this.ccpa_ = z10;
        }

        public final void i(boolean z10) {
            this.bitField0_ |= 4;
            this.coppa_ = z10;
        }

        public final void j(boolean z10) {
            this.bitField0_ |= 2;
            this.gdpr_ = z10;
        }

        public final void k(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.tcfConsentString_ = str;
        }

        public final void l(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.usPrivacy_ = str;
        }
    }

    public static final class j extends GeneratedMessageLite<j, a> implements MessageLiteOrBuilder {
        private static final j DEFAULT_INSTANCE;
        public static final int INITIALIZED_FIELD_NUMBER = 1;
        private static volatile Parser<j> PARSER;
        private int bitField0_;
        private boolean initialized_;

        public static final class a extends GeneratedMessageLite.Builder<j, a> implements MessageLiteOrBuilder {
            public a() {
                super(j.DEFAULT_INSTANCE);
            }

            public a a(boolean z10) {
                copyOnWrite();
                ((j) this.instance).d(z10);
                return this;
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(boolean z10) {
            this.bitField0_ |= 1;
            this.initialized_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "initialized_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<j> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (j.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class k extends GeneratedMessageLite<k, a> implements MessageLiteOrBuilder {
        private static final k DEFAULT_INSTANCE;
        public static final int JSON_CONFIG_FIELD_NUMBER = 1;
        private static volatile Parser<k> PARSER;
        private int bitField0_;
        private String jsonConfig_ = "";

        public static final class a extends GeneratedMessageLite.Builder<k, a> implements MessageLiteOrBuilder {
            public a() {
                super(k.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((k) this.instance).d(str);
                return this;
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.jsonConfig_ = str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "jsonConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<k> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (k.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponents = new BidToken$ClientBidTokenComponents();
        DEFAULT_INSTANCE = bidToken$ClientBidTokenComponents;
        GeneratedMessageLite.registerDefaultInstance(BidToken$ClientBidTokenComponents.class, bidToken$ClientBidTokenComponents);
    }

    public static c n() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$ClientBidTokenComponents();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ለ\u0000\u0002\t\u0003\t\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n", new Object[]{"bitField0_", "idfv_", "privacy_", "device_", "info_", "memoryInfo_", "dirInfo_", "networkInfo_", "adInfo_", "batteryInfo_", "audioInfo_", "accessibilityInfo_", "impLvlRevData_", "testConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$ClientBidTokenComponents> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BidToken$ClientBidTokenComponents.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void o(a aVar) {
        aVar.getClass();
        this.accessibilityInfo_ = aVar;
        this.bitField0_ |= 256;
    }

    public final void p(b bVar) {
        bVar.getClass();
        this.adInfo_ = bVar;
        this.bitField0_ |= 32;
    }

    public final void q(AudioInfo audioInfo) {
        audioInfo.getClass();
        this.audioInfo_ = audioInfo;
        this.bitField0_ |= 128;
    }

    public final void r(BatteryInfo batteryInfo) {
        batteryInfo.getClass();
        this.batteryInfo_ = batteryInfo;
        this.bitField0_ |= 64;
    }

    public final void s(Device device) {
        device.getClass();
        this.device_ = device;
    }

    public final void t(d dVar) {
        dVar.getClass();
        this.dirInfo_ = dVar;
        this.bitField0_ |= 8;
    }

    public final void u(f fVar) {
        fVar.getClass();
        this.impLvlRevData_ = fVar;
        this.bitField0_ |= 512;
    }

    public final void v(j jVar) {
        jVar.getClass();
        this.info_ = jVar;
        this.bitField0_ |= 2;
    }

    public final void w(g gVar) {
        gVar.getClass();
        this.memoryInfo_ = gVar;
        this.bitField0_ |= 4;
    }

    public final void x(NetworkInfo networkInfo) {
        networkInfo.getClass();
        this.networkInfo_ = networkInfo;
        this.bitField0_ |= 16;
    }

    public final void y(i iVar) {
        iVar.getClass();
        this.privacy_ = iVar;
    }

    public final void z(k kVar) {
        kVar.getClass();
        this.testConfig_ = kVar;
        this.bitField0_ |= 1024;
    }
}
