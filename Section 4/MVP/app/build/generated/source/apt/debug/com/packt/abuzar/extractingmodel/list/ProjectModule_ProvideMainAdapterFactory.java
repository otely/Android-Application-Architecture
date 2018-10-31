// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.packt.abuzar.extractingmodel.list;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ProjectModule_ProvideMainAdapterFactory implements Factory<MainAdapter> {
  private final ProjectModule module;

  public ProjectModule_ProvideMainAdapterFactory(ProjectModule module) {
    this.module = module;
  }

  @Override
  public MainAdapter get() {
    return Preconditions.checkNotNull(
        module.provideMainAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainAdapter> create(ProjectModule module) {
    return new ProjectModule_ProvideMainAdapterFactory(module);
  }

  public static MainAdapter proxyProvideMainAdapter(ProjectModule instance) {
    return instance.provideMainAdapter();
  }
}