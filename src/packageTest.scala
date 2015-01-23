
package eu {
  package saramak {
    import eu.samsung.main.A;
    package test {
      class B {
        new A().method();
      }
    }
  }
  package samsung {
    package main {
      class A {
        import eu.saramak.test.B;
        /*package */ def method(){
          new B()
        }
      }
    }
  }
}