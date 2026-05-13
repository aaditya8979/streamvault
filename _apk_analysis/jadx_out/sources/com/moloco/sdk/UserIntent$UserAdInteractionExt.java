package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserIntent$UserAdInteractionExt extends GeneratedMessageLite<UserIntent$UserAdInteractionExt, d> implements MessageLiteOrBuilder {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 3;
    public static final int APP_BACKGROUNDING_INTERACTION_FIELD_NUMBER = 103;
    public static final int APP_FIELD_NUMBER = 5;
    public static final int APP_FOREGROUNDING_INTERACTION_FIELD_NUMBER = 102;
    public static final int CLICK_INTERACTION_FIELD_NUMBER = 101;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 2;
    private static final UserIntent$UserAdInteractionExt DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int IMP_INTERACTION_FIELD_NUMBER = 100;
    public static final int MREF_FIELD_NUMBER = 1;
    public static final int NETWORK_FIELD_NUMBER = 6;
    private static volatile Parser<UserIntent$UserAdInteractionExt> PARSER = null;
    public static final int SDK_FIELD_NUMBER = 7;
    private a app_;
    private long clientTimestamp_;
    private Device device_;
    private Object infoExt_;
    private Network network_;
    private h sdk_;
    private int infoExtCase_ = 0;
    private String mref_ = "";
    private String advertisingId_ = "";

    public static final class Button extends GeneratedMessageLite<Button, a> implements e {
        private static final Button DEFAULT_INSTANCE;
        private static volatile Parser<Button> PARSER = null;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private i pos_;
        private j size_;
        private int type_;

        public enum Type implements Internal.EnumLite {
            NONE(0),
            CLOSE(1),
            SKIP(2),
            MUTE(3),
            UNMUTE(4),
            CTA(5),
            REPLAY(6),
            DEC_SKIP(7),
            AD_BADGE(8),
            UNRECOGNIZED(-1);

            public static final int AD_BADGE_VALUE = 8;
            public static final int CLOSE_VALUE = 1;
            public static final int CTA_VALUE = 5;
            public static final int DEC_SKIP_VALUE = 7;
            public static final int MUTE_VALUE = 3;
            public static final int NONE_VALUE = 0;
            public static final int REPLAY_VALUE = 6;
            public static final int SKIP_VALUE = 2;
            public static final int UNMUTE_VALUE = 4;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<Type> f45698b = new a();
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
                public static final Internal.EnumVerifier f45700a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return Type.forNumber(i10) != null;
                }
            }

            Type(int i10) {
                this.value = i10;
            }

            public static Type forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return NONE;
                    case 1:
                        return CLOSE;
                    case 2:
                        return SKIP;
                    case 3:
                        return MUTE;
                    case 4:
                        return UNMUTE;
                    case 5:
                        return CTA;
                    case 6:
                        return REPLAY;
                    case 7:
                        return DEC_SKIP;
                    case 8:
                        return AD_BADGE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return f45698b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45700a;
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

        public static final class a extends GeneratedMessageLite.Builder<Button, a> implements e {
            public a() {
                super(Button.DEFAULT_INSTANCE);
            }

            public a a(i iVar) {
                copyOnWrite();
                ((Button) this.instance).f(iVar);
                return this;
            }

            public a b(j jVar) {
                copyOnWrite();
                ((Button) this.instance).g(jVar);
                return this;
            }

            public a c(Type type) {
                copyOnWrite();
                ((Button) this.instance).h(type);
                return this;
            }

            @Override // com.moloco.sdk.UserIntent$UserAdInteractionExt.e
            public Type getType() {
                return ((Button) this.instance).getType();
            }
        }

        static {
            Button button = new Button();
            DEFAULT_INSTANCE = button;
            GeneratedMessageLite.registerDefaultInstance(Button.class, button);
        }

        public static a e() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Button();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", "pos_", "size_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Button> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Button.class) {
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

        public final void f(i iVar) {
            iVar.getClass();
            this.pos_ = iVar;
        }

        public final void g(j jVar) {
            jVar.getClass();
            this.size_ = jVar;
        }

        @Override // com.moloco.sdk.UserIntent$UserAdInteractionExt.e
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        public final void h(Type type) {
            this.type_ = type.getNumber();
        }
    }

    public static final class Device extends GeneratedMessageLite<Device, a> implements MessageLiteOrBuilder {
        private static final Device DEFAULT_INSTANCE;
        public static final int MODEL_FIELD_NUMBER = 3;
        public static final int OS_FIELD_NUMBER = 1;
        public static final int OS_VER_FIELD_NUMBER = 2;
        private static volatile Parser<Device> PARSER = null;
        public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
        private int os_;
        private float screenScale_;
        private String osVer_ = "";
        private String model_ = "";

        public enum OsType implements Internal.EnumLite {
            UNKNOWN(0),
            ANDROID(1),
            IOS(2),
            UNRECOGNIZED(-1);

            public static final int ANDROID_VALUE = 1;
            public static final int IOS_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<OsType> f45701b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<OsType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public OsType findValueByNumber(int i10) {
                    return OsType.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45703a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return OsType.forNumber(i10) != null;
                }
            }

            OsType(int i10) {
                this.value = i10;
            }

            public static OsType forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return ANDROID;
                }
                if (i10 != 2) {
                    return null;
                }
                return IOS;
            }

            public static Internal.EnumLiteMap<OsType> internalGetValueMap() {
                return f45701b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45703a;
            }

            @Deprecated
            public static OsType valueOf(int i10) {
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
                ((Device) this.instance).setModel(str);
                return this;
            }

            public a b(OsType osType) {
                copyOnWrite();
                ((Device) this.instance).g(osType);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((Device) this.instance).h(str);
                return this;
            }

            public a d(float f10) {
                copyOnWrite();
                ((Device) this.instance).i(f10);
                return this;
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        public static a f() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new Object[]{"os_", "osVer_", "model_", "screenScale_"});
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

        public final void g(OsType osType) {
            this.os_ = osType.getNumber();
        }

        public final void h(String str) {
            str.getClass();
            this.osVer_ = str;
        }

        public final void i(float f10) {
            this.screenScale_ = f10;
        }

        public final void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }
    }

    public static final class Network extends GeneratedMessageLite<Network, a> implements MessageLiteOrBuilder {
        public static final int CARRIER_FIELD_NUMBER = 2;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
        private static final Network DEFAULT_INSTANCE;
        private static volatile Parser<Network> PARSER;
        private String carrier_ = "";
        private int connectionType_;

        public enum ConnectionType implements Internal.EnumLite {
            UNKNOWN(0),
            WIFI(1),
            CELLULAR(2),
            UNRECOGNIZED(-1);

            public static final int CELLULAR_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            public static final int WIFI_VALUE = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<ConnectionType> f45704b = new a();
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
                public static final Internal.EnumVerifier f45706a = new b();

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
                if (i10 != 2) {
                    return null;
                }
                return CELLULAR;
            }

            public static Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
                return f45704b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45706a;
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

        public static final class a extends GeneratedMessageLite.Builder<Network, a> implements MessageLiteOrBuilder {
            public a() {
                super(Network.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((Network) this.instance).e(str);
                return this;
            }

            public a b(ConnectionType connectionType) {
                copyOnWrite();
                ((Network) this.instance).f(connectionType);
                return this;
            }
        }

        static {
            Network network = new Network();
            DEFAULT_INSTANCE = network;
            GeneratedMessageLite.registerDefaultInstance(Network.class, network);
        }

        public static a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Network();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Network> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Network.class) {
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

        public final void e(String str) {
            str.getClass();
            this.carrier_ = str;
        }

        public final void f(ConnectionType connectionType) {
            this.connectionType_ = connectionType.getNumber();
        }
    }

    public static final class a extends GeneratedMessageLite<a, C0550a> implements MessageLiteOrBuilder {
        private static final a DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<a> PARSER = null;
        public static final int VER_FIELD_NUMBER = 2;
        private String id_ = "";
        private String ver_ = "";

        /* JADX INFO: renamed from: com.moloco.sdk.UserIntent$UserAdInteractionExt$a$a, reason: collision with other inner class name */
        public static final class C0550a extends GeneratedMessageLite.Builder<a, C0550a> implements MessageLiteOrBuilder {
            public C0550a() {
                super(a.DEFAULT_INSTANCE);
            }

            public C0550a a(String str) {
                copyOnWrite();
                ((a) this.instance).e(str);
                return this;
            }

            public C0550a b(String str) {
                copyOnWrite();
                ((a) this.instance).f(str);
                return this;
            }
        }

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        public static C0550a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0550a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "ver_"});
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

        public final void e(String str) {
            str.getClass();
            this.id_ = str;
        }

        public final void f(String str) {
            str.getClass();
            this.ver_ = str;
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        private static final b DEFAULT_INSTANCE;
        private static volatile Parser<b> PARSER;

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

        public static a b() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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

    public static final class c extends GeneratedMessageLite<c, a> implements MessageLiteOrBuilder {
        public static final int BG_TS_MS_FIELD_NUMBER = 1;
        private static final c DEFAULT_INSTANCE;
        private static volatile Parser<c> PARSER;
        private long bgTsMs_;

        public static final class a extends GeneratedMessageLite.Builder<c, a> implements MessageLiteOrBuilder {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a a(long j10) {
                copyOnWrite();
                ((c) this.instance).d(j10);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(long j10) {
            this.bgTsMs_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<c> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (c.class) {
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

    public static final class d extends GeneratedMessageLite.Builder<UserIntent$UserAdInteractionExt, d> implements MessageLiteOrBuilder {
        public d() {
            super(UserIntent$UserAdInteractionExt.DEFAULT_INSTANCE);
        }

        public d a(String str) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).n(str);
            return this;
        }

        public d b(a aVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).o(aVar);
            return this;
        }

        public d c(b bVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).p(bVar);
            return this;
        }

        public d d(c cVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).q(cVar);
            return this;
        }

        public d e(f fVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).r(fVar);
            return this;
        }

        public d f(long j10) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).s(j10);
            return this;
        }

        public d g(Device device) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).t(device);
            return this;
        }

        public d h(g gVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).u(gVar);
            return this;
        }

        public d i(String str) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).v(str);
            return this;
        }

        public d j(Network network) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).w(network);
            return this;
        }

        public d k(h hVar) {
            copyOnWrite();
            ((UserIntent$UserAdInteractionExt) this.instance).x(hVar);
            return this;
        }
    }

    public interface e extends MessageLiteOrBuilder {
        Button.Type getType();
    }

    public static final class f extends GeneratedMessageLite<f, a> implements MessageLiteOrBuilder {
        public static final int BUTTONS_FIELD_NUMBER = 5;
        public static final int CLICK_POS_FIELD_NUMBER = 1;
        private static final f DEFAULT_INSTANCE;
        private static volatile Parser<f> PARSER = null;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
        public static final int VIEW_POS_FIELD_NUMBER = 3;
        public static final int VIEW_SIZE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<Button> buttons_ = GeneratedMessageLite.emptyProtobufList();
        private i clickPos_;
        private j screenSize_;
        private i viewPos_;
        private j viewSize_;

        public static final class a extends GeneratedMessageLite.Builder<f, a> implements MessageLiteOrBuilder {
            public a() {
                super(f.DEFAULT_INSTANCE);
            }

            public a a(Iterable<? extends Button> iterable) {
                copyOnWrite();
                ((f) this.instance).g(iterable);
                return this;
            }

            public a b(i iVar) {
                copyOnWrite();
                ((f) this.instance).j(iVar);
                return this;
            }

            public a c(j jVar) {
                copyOnWrite();
                ((f) this.instance).k(jVar);
                return this;
            }

            public a d(i iVar) {
                copyOnWrite();
                ((f) this.instance).l(iVar);
                return this;
            }

            public a e(j jVar) {
                copyOnWrite();
                ((f) this.instance).m(jVar);
                return this;
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        public static a i() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", Button.class});
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

        public final void g(Iterable<? extends Button> iterable) {
            h();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.buttons_);
        }

        public final void h() {
            Internal.ProtobufList<Button> protobufList = this.buttons_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.buttons_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public final void j(i iVar) {
            iVar.getClass();
            this.clickPos_ = iVar;
        }

        public final void k(j jVar) {
            jVar.getClass();
            this.screenSize_ = jVar;
        }

        public final void l(i iVar) {
            iVar.getClass();
            this.viewPos_ = iVar;
        }

        public final void m(j jVar) {
            jVar.getClass();
            this.viewSize_ = jVar;
        }
    }

    public static final class g extends GeneratedMessageLite<g, a> implements MessageLiteOrBuilder {
        private static final g DEFAULT_INSTANCE;
        private static volatile Parser<g> PARSER;

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

        public static a b() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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
    }

    public static final class h extends GeneratedMessageLite<h, a> implements MessageLiteOrBuilder {
        public static final int ADAPTER_VER_FIELD_NUMBER = 2;
        public static final int CORE_VER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        private static volatile Parser<h> PARSER;
        private String coreVer_ = "";
        private String adapterVer_ = "";

        public static final class a extends GeneratedMessageLite.Builder<h, a> implements MessageLiteOrBuilder {
            public a() {
                super(h.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((h) this.instance).d(str);
                return this;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(String str) {
            str.getClass();
            this.coreVer_ = str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
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
    }

    public static final class i extends GeneratedMessageLite<i, a> implements MessageLiteOrBuilder {
        private static final i DEFAULT_INSTANCE;
        private static volatile Parser<i> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private float x_;
        private float y_;

        public static final class a extends GeneratedMessageLite.Builder<i, a> implements MessageLiteOrBuilder {
            public a() {
                super(i.DEFAULT_INSTANCE);
            }

            public a a(float f10) {
                copyOnWrite();
                ((i) this.instance).e(f10);
                return this;
            }

            public a b(float f10) {
                copyOnWrite();
                ((i) this.instance).f(f10);
                return this;
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
        }

        public static a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
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

        public final void e(float f10) {
            this.x_ = f10;
        }

        public final void f(float f10) {
            this.y_ = f10;
        }
    }

    public static final class j extends GeneratedMessageLite<j, a> implements MessageLiteOrBuilder {
        private static final j DEFAULT_INSTANCE;
        public static final int H_FIELD_NUMBER = 2;
        private static volatile Parser<j> PARSER = null;
        public static final int W_FIELD_NUMBER = 1;
        private float h_;
        private float w_;

        public static final class a extends GeneratedMessageLite.Builder<j, a> implements MessageLiteOrBuilder {
            public a() {
                super(j.DEFAULT_INSTANCE);
            }

            public a a(float f10) {
                copyOnWrite();
                ((j) this.instance).e(f10);
                return this;
            }

            public a b(float f10) {
                copyOnWrite();
                ((j) this.instance).f(f10);
                return this;
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
        }

        public static a d() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (l1.f47619a[methodToInvoke.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
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

        public final void e(float f10) {
            this.h_ = f10;
        }

        public final void f(float f10) {
            this.w_ = f10;
        }
    }

    static {
        UserIntent$UserAdInteractionExt userIntent$UserAdInteractionExt = new UserIntent$UserAdInteractionExt();
        DEFAULT_INSTANCE = userIntent$UserAdInteractionExt;
        GeneratedMessageLite.registerDefaultInstance(UserIntent$UserAdInteractionExt.class, userIntent$UserAdInteractionExt);
    }

    public static d m() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (l1.f47619a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserIntent$UserAdInteractionExt();
            case 2:
                return new d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001g\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\td<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"infoExt_", "infoExtCase_", "mref_", "clientTimestamp_", "advertisingId_", "device_", "app_", "network_", "sdk_", g.class, f.class, c.class, b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserIntent$UserAdInteractionExt> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (UserIntent$UserAdInteractionExt.class) {
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

    public final void n(String str) {
        str.getClass();
        this.advertisingId_ = str;
    }

    public final void o(a aVar) {
        aVar.getClass();
        this.app_ = aVar;
    }

    public final void p(b bVar) {
        bVar.getClass();
        this.infoExt_ = bVar;
        this.infoExtCase_ = 103;
    }

    public final void q(c cVar) {
        cVar.getClass();
        this.infoExt_ = cVar;
        this.infoExtCase_ = 102;
    }

    public final void r(f fVar) {
        fVar.getClass();
        this.infoExt_ = fVar;
        this.infoExtCase_ = 101;
    }

    public final void s(long j10) {
        this.clientTimestamp_ = j10;
    }

    public final void t(Device device) {
        device.getClass();
        this.device_ = device;
    }

    public final void u(g gVar) {
        gVar.getClass();
        this.infoExt_ = gVar;
        this.infoExtCase_ = 100;
    }

    public final void v(String str) {
        str.getClass();
        this.mref_ = str;
    }

    public final void w(Network network) {
        network.getClass();
        this.network_ = network;
    }

    public final void x(h hVar) {
        hVar.getClass();
        this.sdk_ = hVar;
    }
}
