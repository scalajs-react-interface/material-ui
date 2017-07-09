
package sri.materialui;


import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault,
  OptionalParam
}
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/BottomNavigation","BottomNavigationButton")
object MuiBottomNavigationButtonComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiBottomNavigationButton {
    
    @inline
    def apply(index : OptionalParam[Double | Int] = OptDefault,
id : OptionalParam[String] = OptDefault,
showLabel : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
label : OptionalParam[ReactNode] = OptDefault,
icon : OptionalParam[ReactNode] = OptDefault,
onChange : OptionalParam[(ReactEventH,Int) => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
selected : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiBottomNavigationButtonComponent.type, Unit] = null): ReactElement { type Instance = MuiBottomNavigationButtonComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiBottomNavigationButtonComponent.type](
      MuiBottomNavigationButtonComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         