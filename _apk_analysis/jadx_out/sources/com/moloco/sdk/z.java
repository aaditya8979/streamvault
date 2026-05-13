package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: ConfigsOuterClass.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends GeneratedMessageLite<z, b> implements MessageLiteOrBuilder {
    public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
    public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
    private static final z DEFAULT_INSTANCE;
    public static final int IOS_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<z> PARSER;
    private int clientConfigsCase_ = 0;
    private Object clientConfigs_;
    private c commonConfigs_;

    /* JADX INFO: compiled from: ConfigsOuterClass.java */
    public static final class a extends GeneratedMessageLite<a, C0699a> implements MessageLiteOrBuilder {
        private static final a DEFAULT_INSTANCE;
        private static volatile Parser<a> PARSER;

        /* JADX INFO: renamed from: com.moloco.sdk.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConfigsOuterClass.java */
        public static final class C0699a extends GeneratedMessageLite.Builder<a, C0699a> implements MessageLiteOrBuilder {
            public C0699a() {
                super(a.DEFAULT_INSTANCE);
            }
        }

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (x.f47685a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0699a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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
    }

    /* JADX INFO: compiled from: ConfigsOuterClass.java */
    public static final class b extends GeneratedMessageLite.Builder<z, b> implements MessageLiteOrBuilder {
        public b() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: ConfigsOuterClass.java */
    public static final class c extends GeneratedMessageLite<c, a> implements MessageLiteOrBuilder {
        private static final c DEFAULT_INSTANCE;
        public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
        private static volatile Parser<c> PARSER;
        private b mediaConfig_;

        /* JADX INFO: compiled from: ConfigsOuterClass.java */
        public static final class a extends GeneratedMessageLite.Builder<c, a> implements MessageLiteOrBuilder {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: ConfigsOuterClass.java */
        public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
            private static final b DEFAULT_INSTANCE;
            public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
            private static volatile Parser<b> PARSER = null;
            public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
            private int bitField0_;
            private double minStreamingPlayableDurationOnTimeoutSecs_;
            private long streamingChunkSizeKilobytes_;

            /* JADX INFO: compiled from: ConfigsOuterClass.java */
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

            public static b b() {
                return DEFAULT_INSTANCE;
            }

            public double c() {
                return this.minStreamingPlayableDurationOnTimeoutSecs_;
            }

            public long d() {
                return this.streamingChunkSizeKilobytes_;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (x.f47685a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
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

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        public static c b() {
            return DEFAULT_INSTANCE;
        }

        public b c() {
            b bVar = this.mediaConfig_;
            return bVar == null ? b.b() : bVar;
        }

        public boolean d() {
            return this.mediaConfig_ != null;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (x.f47685a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"mediaConfig_"});
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

    /* JADX INFO: compiled from: ConfigsOuterClass.java */
    public static final class d extends GeneratedMessageLite<d, a> implements MessageLiteOrBuilder {
        private static final d DEFAULT_INSTANCE;
        private static volatile Parser<d> PARSER;

        /* JADX INFO: compiled from: ConfigsOuterClass.java */
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
            switch (x.f47685a[methodToInvoke.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
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

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        GeneratedMessageLite.registerDefaultInstance(z.class, zVar);
    }

    public static z c() {
        return DEFAULT_INSTANCE;
    }

    public c b() {
        c cVar = this.commonConfigs_;
        return cVar == null ? c.b() : cVar;
    }

    public boolean d() {
        return this.commonConfigs_ != null;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (x.f47685a[methodToInvoke.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"clientConfigs_", "clientConfigsCase_", a.class, d.class, "commonConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<z> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (z.class) {
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
