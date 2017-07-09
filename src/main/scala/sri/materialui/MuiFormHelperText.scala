
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
 @JSImport("material-ui/Form","FormHelperText")
object MuiFormHelperTextComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiFormHelperText {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiFormHelperTextComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiFormHelperTextComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiFormHelperTextComponent.type](
      MuiFormHelperTextComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiFormHelperTextC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiFormHelperTextComponent.type](
      MuiFormHelperTextComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         