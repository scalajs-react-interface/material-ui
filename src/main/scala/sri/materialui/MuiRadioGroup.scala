
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
 @JSImport("material-ui/Radio","RadioGroup")
object MuiRadioGroupComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiRadioGroup {
    
    @inline
    def apply(selectedValue : OptionalParam[String] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onChange : OptionalParam[(ReactEventH,String) => _] = OptDefault,
onBlur : OptionalParam[ReactEventH => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onKeyDown : OptionalParam[ReactEventH => _] = OptDefault,
name : OptionalParam[String] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiRadioGroupComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiRadioGroupComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiRadioGroupComponent.type](
      MuiRadioGroupComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiRadioGroupC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiRadioGroupComponent.type](
      MuiRadioGroupComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         