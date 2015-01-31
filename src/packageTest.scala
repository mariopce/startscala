
package eu {
  object Utils{
    def met(){}
  }
  package saramak {
    import eu.samsung.main.A;
    import java.util.{HashMap => JavaHashMap}
    import java.util.{Arrays => _ } //hide array
    package test {
      class B {
        Array(1); //scala array because java array is hidden
        Utils.met();
        new JavaHashMap().clear();
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