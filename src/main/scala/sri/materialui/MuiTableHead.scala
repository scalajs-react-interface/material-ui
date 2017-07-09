
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
 @JSImport("material-ui/Table","TableHead")
object MuiTableHeadComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTableHead {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTableHeadComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTableHeadComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTableHeadComponent.type](
      MuiTableHeadComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTableHeadC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTableHeadComponent.type](
      MuiTableHeadComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         