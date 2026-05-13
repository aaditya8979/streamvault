package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: compiled from: MetricsRequest.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b1 extends GeneratedMessageLite<b1, a> implements MessageLiteOrBuilder {
    public static final int COUNTS_FIELD_NUMBER = 1;
    private static final b1 DEFAULT_INSTANCE;
    public static final int DURATIONS_FIELD_NUMBER = 2;
    private static volatile Parser<b1> PARSER;
    private Internal.ProtobufList<b> counts_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c> durations_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: MetricsRequest.java */
    public static final class a extends GeneratedMessageLite.Builder<b1, a> implements MessageLiteOrBuilder {
        public a() {
            super(b1.DEFAULT_INSTANCE);
        }

        public a a(Iterable<? extends b> iterable) {
            copyOnWrite();
            ((b1) this.instance).d(iterable);
            return this;
        }

        public a b(Iterable<? extends c> iterable) {
            copyOnWrite();
            ((b1) this.instance).e(iterable);
            return this;
        }
    }

    /* JADX INFO: compiled from: MetricsRequest.java */
    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 2;
        private static final b DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<b> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private int count_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: MetricsRequest.java */
        public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }

            public a a(Iterable<String> iterable) {
                copyOnWrite();
                ((b) this.instance).e(iterable);
                return this;
            }

            public a b(int i10) {
                copyOnWrite();
                ((b) this.instance).h(i10);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((b) this.instance).setName(str);
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
            switch (z0.f51009a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
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

        public final void e(Iterable<String> iterable) {
            f();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        public final void f() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public final void h(int i10) {
            this.count_ = i10;
        }

        public final void setName(String str) {
            str.getClass();
            this.name_ = str;
        }
    }

    /* JADX INFO: compiled from: MetricsRequest.java */
    public static final class c extends GeneratedMessageLite<c, a> implements MessageLiteOrBuilder {
        private static final c DEFAULT_INSTANCE;
        public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<c> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private long elapsedTimeMillis_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: MetricsRequest.java */
        public static final class a extends GeneratedMessageLite.Builder<c, a> implements MessageLiteOrBuilder {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a a(Iterable<String> iterable) {
                copyOnWrite();
                ((c) this.instance).e(iterable);
                return this;
            }

            public a b(long j10) {
                copyOnWrite();
                ((c) this.instance).h(j10);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((c) this.instance).setName(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        public static a g() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (z0.f51009a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
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

        public final void e(Iterable<String> iterable) {
            f();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        public final void f() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public final void h(long j10) {
            this.elapsedTimeMillis_ = j10;
        }

        public final void setName(String str) {
            str.getClass();
            this.name_ = str;
        }
    }

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        GeneratedMessageLite.registerDefaultInstance(b1.class, b1Var);
    }

    public static a h() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final void d(Iterable<? extends b> iterable) {
        f();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.counts_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (z0.f51009a[methodToInvoke.ordinal()]) {
            case 1:
                return new b1();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"counts_", b.class, "durations_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<b1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (b1.class) {
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

    public final void e(Iterable<? extends c> iterable) {
        g();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.durations_);
    }

    public final void f() {
        Internal.ProtobufList<b> protobufList = this.counts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.counts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void g() {
        Internal.ProtobufList<c> protobufList = this.durations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.durations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }
}
