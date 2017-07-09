
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
 @JSImport("material-ui/Form","FormGroup")
object MuiFormGroupComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiFormGroup {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
row : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiFormGroupComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiFormGroupComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiFormGroupComponent.type](
      MuiFormGroupComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiFormGroupC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiFormGroupComponent.type](
      MuiFormGroupComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         