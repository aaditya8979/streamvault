package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Init$SDKInitResponse extends GeneratedMessageLite<Init$SDKInitResponse, c> implements MessageLiteOrBuilder {
    public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
    public static final int CONFIGS_FIELD_NUMBER = 16;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
    public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
    private static final Init$SDKInitResponse DEFAULT_INSTANCE;
    public static final int DIRECT_ADS_CONFIG_FIELD_NUMBER = 18;
    public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
    public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
    public static final int GEO_FIELD_NUMBER = 10;
    public static final int ILRD_CONFIG_FIELD_NUMBER = 17;
    public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
    private static volatile Parser<Init$SDKInitResponse> PARSER = null;
    public static final int PLATFORM_ID_FIELD_NUMBER = 8;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
    public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
    public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
    private b bidTokenConfig_;
    private z configs_;
    private d crashReportingConfig_;
    private e directAdsConfig_;
    private f eventCollectionConfig_;
    private h geo_;
    private i ilrdConfig_;
    private j operationalMetricsConfig_;
    private int resolvedRegion_;
    private boolean verifyBannerVisible_;
    private String appId_ = "";
    private String publisherId_ = "";
    private String countryIso3Code_ = "";
    private Internal.ProtobufList<AdUnit> adUnits_ = GeneratedMessageLite.emptyProtobufList();
    private String adServerUrl_ = "";
    private String countryIso2Code_ = "";
    private String platformId_ = "";
    private Internal.ProtobufList<g> experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();

    public static final class AdUnit extends GeneratedMessageLite<AdUnit, a> implements a {
        public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
        public static final int BID_FLOOR_FIELD_NUMBER = 4;
        private static final AdUnit DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int NATIVE_FIELD_NUMBER = 6;
        private static volatile Parser<AdUnit> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int adFrequency_;
        private float bidFloor_;
        private String id_ = "";
        private String name_ = "";
        private Native native_;
        private int type_;

        public enum InventoryType implements Internal.EnumLite {
            INVALID(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE(3),
            REWARD_VIDEO(4),
            MREC(6),
            UNRECOGNIZED(-1);

            public static final int BANNER_VALUE = 1;
            public static final int INTERSTITIAL_VALUE = 2;
            public static final int INVALID_VALUE = 0;
            public static final int MREC_VALUE = 6;
            public static final int NATIVE_VALUE = 3;
            public static final int REWARD_VIDEO_VALUE = 4;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<InventoryType> f45686b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<InventoryType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public InventoryType findValueByNumber(int i10) {
                    return InventoryType.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45688a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return InventoryType.forNumber(i10) != null;
                }
            }

            InventoryType(int i10) {
                this.value = i10;
            }

            public static InventoryType forNumber(int i10) {
                if (i10 == 0) {
                    return INVALID;
                }
                if (i10 == 1) {
                    return BANNER;
                }
                if (i10 == 2) {
                    return INTERSTITIAL;
                }
                if (i10 == 3) {
                    return NATIVE;
                }
                if (i10 == 4) {
                    return REWARD_VIDEO;
                }
                if (i10 != 6) {
                    return null;
                }
                return MREC;
            }

            public static Internal.EnumLiteMap<InventoryType> internalGetValueMap() {
                return f45686b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45688a;
            }

            @Deprecated
            public static InventoryType valueOf(int i10) {
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

        public static final class Native extends GeneratedMessageLite<Native, a> implements b {
            private static final Native DEFAULT_INSTANCE;
            private static volatile Parser<Native> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;

            public enum Type implements Internal.EnumLite {
                UNKNOWN_TYPE(0),
                LOGO(1),
                IMAGE(2),
                VIDEO(3),
                UNRECOGNIZED(-1);

                public static final int IMAGE_VALUE = 2;
                public static final int LOGO_VALUE = 1;
                public static final int UNKNOWN_TYPE_VALUE = 0;
                public static final int VIDEO_VALUE = 3;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final Internal.EnumLiteMap<Type> f45689b = new a();
                private final int value;

                public class a implements Internal.EnumLiteMap<Type> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Type findValueByNumber(int i10) {
                        return Type.forNumber(i10);
                    }
                }

                public static final class b implements Internal.EnumVerifier {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final Internal.EnumVerifier f45691a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return Type.forNumber(i10) != null;
                    }
                }

                Type(int i10) {
                    this.value = i10;
                }

                public static Type forNumber(int i10) {
                    if (i10 == 0) {
                        return UNKNOWN_TYPE;
                    }
                    if (i10 == 1) {
                        return LOGO;
                    }
                    if (i10 == 2) {
                        return IMAGE;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return VIDEO;
                }

                public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                    return f45689b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f45691a;
                }

                @Deprecated
                public static Type valueOf(int i10) {
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

            public static final class a extends GeneratedMessageLite.Builder<Native, a> implements b {
                public a() {
                    super(Native.DEFAULT_INSTANCE);
                }

                @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.b
                public Type getType() {
                    return ((Native) this.instance).getType();
                }
            }

            static {
                Native r02 = new Native();
                DEFAULT_INSTANCE = r02;
                GeneratedMessageLite.registerDefaultInstance(Native.class, r02);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (n0.f47620a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Native();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Native> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Native.class) {
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

            @Override // com.moloco.sdk.Init.SDKInitResponse.AdUnit.b
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<AdUnit, a> implements a {
            public a() {
                super(AdUnit.DEFAULT_INSTANCE);
            }

            @Override // com.moloco.sdk.Init$SDKInitResponse.a
            public InventoryType getType() {
                return ((AdUnit) this.instance).getType();
            }
        }

        public interface b extends MessageLiteOrBuilder {
            Native.Type getType();
        }

        static {
            AdUnit adUnit = new AdUnit();
            DEFAULT_INSTANCE = adUnit;
            GeneratedMessageLite.registerDefaultInstance(AdUnit.class, adUnit);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdUnit();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdUnit> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdUnit.class) {
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

        @Override // com.moloco.sdk.Init$SDKInitResponse.a
        public InventoryType getType() {
            InventoryType inventoryTypeForNumber = InventoryType.forNumber(this.type_);
            return inventoryTypeForNumber == null ? InventoryType.UNRECOGNIZED : inventoryTypeForNumber;
        }
    }

    public enum SupportedNetworks implements Internal.EnumLite {
        UNKNOWN(0),
        MAX(1),
        LEVEL_PLAY(2),
        UNRECOGNIZED(-1);

        public static final int LEVEL_PLAY_VALUE = 2;
        public static final int MAX_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Internal.EnumLiteMap<SupportedNetworks> f45692b = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<SupportedNetworks> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SupportedNetworks findValueByNumber(int i10) {
                return SupportedNetworks.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f45694a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return SupportedNetworks.forNumber(i10) != null;
            }
        }

        SupportedNetworks(int i10) {
            this.value = i10;
        }

        public static SupportedNetworks forNumber(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return MAX;
            }
            if (i10 != 2) {
                return null;
            }
            return LEVEL_PLAY;
        }

        public static Internal.EnumLiteMap<SupportedNetworks> internalGetValueMap() {
            return f45692b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f45694a;
        }

        @Deprecated
        public static SupportedNetworks valueOf(int i10) {
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

    public interface a extends MessageLiteOrBuilder {
        AdUnit.InventoryType getType();
    }

    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
        private static final b DEFAULT_INSTANCE;
        private static volatile Parser<b> PARSER;
        private String bidTokenUrl_ = "";

        public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"bidTokenUrl_"});
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
    }

    public static final class c extends GeneratedMessageLite.Builder<Init$SDKInitResponse, c> implements MessageLiteOrBuilder {
        public c() {
            super(Init$SDKInitResponse.DEFAULT_INSTANCE);
        }
    }

    public static final class d extends GeneratedMessageLite<d, a> implements MessageLiteOrBuilder {
        private static final d DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<d> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder<d, a> implements MessageLiteOrBuilder {
            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
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
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder<e, a> implements MessageLiteOrBuilder {
            public a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
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
        public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
        public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
        private static final f DEFAULT_INSTANCE;
        public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
        public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
        private static volatile Parser<f> PARSER;
        private String appBackgroundTrackingUrl_ = "";
        private String appForegroundTrackingUrl_ = "";
        private boolean eventCollectionEnabled_;
        private boolean mrefCollectionEnabled_;

        public static final class a extends GeneratedMessageLite.Builder<f, a> implements MessageLiteOrBuilder {
            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        public static f d() {
            return DEFAULT_INSTANCE;
        }

        public String b() {
            return this.appBackgroundTrackingUrl_;
        }

        public String c() {
            return this.appForegroundTrackingUrl_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
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

        public boolean e() {
            return this.eventCollectionEnabled_;
        }

        public boolean f() {
            return this.mrefCollectionEnabled_;
        }
    }

    public static final class g extends GeneratedMessageLite<g, a> implements MessageLiteOrBuilder {
        private static final g DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<g> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String name_ = "";
        private String value_ = "";

        public static final class a extends GeneratedMessageLite.Builder<g, a> implements MessageLiteOrBuilder {
            public a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
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

        public String getName() {
            return this.name_;
        }

        public String getValue() {
            return this.value_;
        }
    }

    public static final class h extends GeneratedMessageLite<h, a> implements MessageLiteOrBuilder {
        public static final int CITY_FIELD_NUMBER = 6;
        public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
        public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 4;
        private static volatile Parser<h> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 7;
        public static final int ZIP_CODE_FIELD_NUMBER = 5;
        private float latitude_;
        private float longitude_;
        private String countryIso3Code_ = "";
        private String countryIso2Code_ = "";
        private String zipCode_ = "";
        private String city_ = "";
        private String region_ = "";

        public static final class a extends GeneratedMessageLite.Builder<h, a> implements MessageLiteOrBuilder {
            public a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
        }

        public String b() {
            return this.city_;
        }

        public String c() {
            return this.countryIso2Code_;
        }

        public String d() {
            return this.countryIso3Code_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<h> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (h.class) {
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

        public float e() {
            return this.latitude_;
        }

        public float f() {
            return this.longitude_;
        }

        public String g() {
            return this.zipCode_;
        }
    }

    public static final class i extends GeneratedMessageLite<i, b> implements MessageLiteOrBuilder {
        private static final i DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
        public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
        private static volatile Parser<i> PARSER = null;
        public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
        public static final int RETRY_COUNT_FIELD_NUMBER = 4;
        public static final int SESSION_EXP_FIELD_NUMBER = 3;
        public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
        public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
        private static final Internal.ListAdapter.Converter<Integer, SupportedNetworks> supportedNetworks_converter_ = new a();
        private boolean enabled_;
        private int maxBatchSize_;
        private int maxSessionLen_;
        private int retryCount_;
        private int sessionExp_;
        private int supportedNetworksMemoizedSerializedSize;
        private int uploadInterval_;
        private String rawImpUrl_ = "";
        private Internal.IntList supportedNetworks_ = GeneratedMessageLite.emptyIntList();

        public class a implements Internal.ListAdapter.Converter<Integer, SupportedNetworks> {
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SupportedNetworks convert(Integer num) {
                SupportedNetworks supportedNetworksForNumber = SupportedNetworks.forNumber(num.intValue());
                return supportedNetworksForNumber == null ? SupportedNetworks.UNRECOGNIZED : supportedNetworksForNumber;
            }
        }

        public static final class b extends GeneratedMessageLite.Builder<i, b> implements MessageLiteOrBuilder {
            public b() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
        }

        public static i b() {
            return DEFAULT_INSTANCE;
        }

        public int c() {
            return this.maxSessionLen_;
        }

        public String d() {
            return this.rawImpUrl_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
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

        public int e() {
            return this.sessionExp_;
        }

        public List<SupportedNetworks> f() {
            return new Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
        }

        public int g() {
            return this.uploadInterval_;
        }

        public boolean getEnabled() {
            return this.enabled_;
        }

        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }
    }

    public static final class j extends GeneratedMessageLite<j, a> implements MessageLiteOrBuilder {
        private static final j DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<j> PARSER = null;
        public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private int pollingIntervalSeconds_;
        private String url_ = "";

        public static final class a extends GeneratedMessageLite.Builder<j, a> implements MessageLiteOrBuilder {
            public a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
        }

        public static j b() {
            return DEFAULT_INSTANCE;
        }

        public int c() {
            return this.pollingIntervalSeconds_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (n0.f47620a[methodToInvoke.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
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

        public String getUrl() {
            return this.url_;
        }
    }

    static {
        Init$SDKInitResponse init$SDKInitResponse = new Init$SDKInitResponse();
        DEFAULT_INSTANCE = init$SDKInitResponse;
        GeneratedMessageLite.registerDefaultInstance(Init$SDKInitResponse.class, init$SDKInitResponse);
    }

    public static Init$SDKInitResponse o(byte[] bArr) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public String b() {
        return this.appId_;
    }

    public z c() {
        z zVar = this.configs_;
        return zVar == null ? z.c() : zVar;
    }

    public String d() {
        return this.countryIso2Code_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (n0.f47620a[methodToInvoke.ordinal()]) {
            case 1:
                return new Init$SDKInitResponse();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t", new Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", AdUnit.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", g.class, "operationalMetricsConfig_", "crashReportingConfig_", "configs_", "ilrdConfig_", "directAdsConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Init$SDKInitResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Init$SDKInitResponse.class) {
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

    public f e() {
        f fVar = this.eventCollectionConfig_;
        return fVar == null ? f.d() : fVar;
    }

    public List<g> f() {
        return this.experimentalFeatureFlags_;
    }

    public i g() {
        i iVar = this.ilrdConfig_;
        return iVar == null ? i.b() : iVar;
    }

    public j h() {
        j jVar = this.operationalMetricsConfig_;
        return jVar == null ? j.b() : jVar;
    }

    public String i() {
        return this.publisherId_;
    }

    public boolean j() {
        return this.verifyBannerVisible_;
    }

    public boolean k() {
        return this.configs_ != null;
    }

    public boolean l() {
        return this.eventCollectionConfig_ != null;
    }

    public boolean m() {
        return this.ilrdConfig_ != null;
    }

    public boolean n() {
        return this.operationalMetricsConfig_ != null;
    }
}
