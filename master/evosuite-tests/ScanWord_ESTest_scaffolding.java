/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 27 18:29:05 GMT 2017
 */


import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ScanWord_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ScanWord"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ScanWord_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.proxy.FixedValueGenerator",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls",
      "org.mockito.cglib.proxy.InvocationHandlerGenerator",
      "org.mockito.mock.SerializableMode",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.handler.MockHandlerFactory",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.proxy.CallbackGenerator",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.internal.handler.MockHandlerImpl",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.internal.creation.instance.InstantationException",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.internal.stubbing.OngoingStubbingImpl",
      "org.mockito.exceptions.misusing.FriendlyReminderException",
      "org.mockito.internal.progress.SequenceNumber",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMocks",
      "org.mockito.cglib.core.Local",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.objenesis.Objenesis",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.verification.VerificationMode",
      "org.mockito.plugins.MockMaker",
      "org.mockito.cglib.proxy.CallbackGenerator$Context",
      "org.mockito.asm.Item",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.objenesis.instantiator.sun.SunReflectionFactoryHelper",
      "org.mockito.internal.progress.IOngoingStubbing",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.internal.MockitoCore",
      "org.mockito.internal.verification.api.VerificationDataInOrder",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.ClassEmitter$2",
      "org.mockito.stubbing.Answer",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.cglib.proxy.Enhancer",
      "org.mockito.cglib.core.EmitUtils$13",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.cglib.core.EmitUtils$14",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.cglib.core.EmitUtils$10",
      "org.mockito.Incubating",
      "org.objenesis.instantiator.ObjectInstantiator",
      "org.mockito.asm.Opcodes",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.exceptions.base.MockitoSerializationIssue",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.MockSettings",
      "org.mockito.cglib.proxy.ProxyRefDispatcher",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.mockito.internal.debugging.LocationImpl",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.cglib.core.CollectionUtils",
      "org.hamcrest.Matcher",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.internal.verification.SingleRegisteredInvocation",
      "org.mockito.cglib.core.Customizer",
      "org.mockito.internal.creation.instance.Instantiator",
      "org.mockito.listeners.MethodInvocationReport",
      "org.mockito.exceptions.Reporter",
      "org.mockito.stubbing.VoidMethodStubbable",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.cglib.proxy.NoOp",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.verification.VerificationWithTimeout",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.invocation.StubInfo",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.internal.creation.cglib.MockitoNamingPolicy",
      "org.mockito.internal.stubbing.answers.Returns",
      "org.mockito.internal.creation.util.SearchingClassLoader",
      "org.hamcrest.SelfDescribing",
      "org.mockito.asm.FieldWriter",
      "org.mockito.configuration.MockitoConfiguration",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.internal.creation.settings.CreationSettings",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.cglib.proxy.Dispatcher",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.invocation.DescribedInvocation",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.InternalMockHandler",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.RejectModifierPredicate",
      "org.mockito.cglib.core.Signature",
      "org.mockito.internal.invocation.realmethod.CleanTraceRealMethod",
      "org.mockito.internal.stubbing.BaseStubbing",
      "org.mockito.cglib.core.EmitUtils$5",
      "org.mockito.cglib.proxy.CallbackFilter",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.cglib.core.EmitUtils$6",
      "org.mockito.internal.creation.cglib.DelegatingMockitoMethodProxy",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.mock.MockCreationSettings",
      "org.mockito.internal.stubbing.InvocationContainer",
      "org.mockito.invocation.Location",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$2",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.objenesis.strategy.PlatformDescription",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.cglib.proxy.FixedValue",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.internal.creation.cglib.CGLIBHacker",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.objenesis.ObjenesisStd",
      "org.mockito.internal.progress.MockingProgress",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.mockito.internal.stubbing.answers.CallsRealMethods",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback",
      "org.mockito.internal.invocation.ArgumentsProcessor",
      "org.mockito.internal.handler.InvocationNotifierHandler",
      "org.mockito.internal.creation.cglib.ClassImposterizer",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.stubbing.DeprecatedOngoingStubbing",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.internal.util.collections.ListUtil$Filter",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.objenesis.strategy.InstantiatorStrategy",
      "org.mockito.internal.invocation.InvocationImpl",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.internal.creation.instance.ObjenesisInstantiator",
      "org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator",
      "org.mockito.internal.creation.cglib.SerializableNoOp",
      "org.mockito.internal.creation.cglib.ClassImposterizer$1",
      "org.mockito.internal.creation.cglib.ClassImposterizer$3",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.internal.creation.cglib.ClassImposterizer$2",
      "org.mockito.plugins.PluginSwitch",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.creation.util.MockitoMethodProxy",
      "org.mockito.invocation.MockHandler",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.internal.creation.cglib.AcrossJVMSerializationFeature",
      "org.mockito.MockitoDebugger",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.stubbing.OngoingStubbing",
      "org.mockito.cglib.proxy.Factory",
      "org.mockito.internal.progress.ArgumentMatcherStorage",
      "org.mockito.internal.util.MockNameImpl",
      "org.mockito.cglib.proxy.LazyLoaderGenerator",
      "org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock",
      "org.mockito.cglib.proxy.NoOp$1",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "ScanWord",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.objenesis.ObjenesisException",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.invocation.Invocation",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.proxy.Enhancer$5",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.proxy.Enhancer$6",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.cglib.proxy.LazyLoader",
      "org.mockito.internal.exceptions.VerificationAwareInvocation",
      "org.mockito.verification.VerificationAfterDelay",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.handler.NullResultGuardian",
      "org.mockito.cglib.proxy.InvocationHandler",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.internal.creation.instance.InstantiatorProvider",
      "org.mockito.internal.invocation.AbstractAwareMethod",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "org.mockito.cglib.core.MethodWrapper$MethodWrapperKey",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.internal.invocation.realmethod.DefaultRealMethod",
      "org.mockito.Matchers",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.proxy.DispatcherGenerator",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.mock.MockName",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.asm.ClassReader",
      "org.mockito.internal.creation.cglib.MethodInterceptorFilter",
      "org.mockito.internal.verification.api.VerificationData",
      "org.mockito.internal.util.Primitives",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.asm.MethodWriter",
      "org.mockito.MockingDetails",
      "org.mockito.cglib.proxy.CallbackInfo",
      "org.mockito.internal.verification.DefaultRegisteredInvocations",
      "org.mockito.asm.Attribute",
      "org.mockito.InOrder",
      "org.mockito.Answers",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.proxy.NoOpGenerator",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues",
      "org.mockito.exceptions.stacktrace.StackTraceCleaner",
      "org.mockito.internal.progress.HandyReturnValues",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.Mockito",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.cglib.proxy.Enhancer$EnhancerKey",
      "org.mockito.cglib.proxy.Enhancer$1",
      "org.mockito.cglib.proxy.Enhancer$2",
      "org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue",
      "org.objenesis.ObjenesisBase",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.cglib.proxy.Enhancer$3",
      "org.mockito.cglib.proxy.Enhancer$4",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ScanWord_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ScanWord"
    );
  }
}
