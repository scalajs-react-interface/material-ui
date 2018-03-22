package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/TextField","TextFieldLabel")
object MuiTextFieldLabelComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTextFieldLabel {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
required : OptionalParam[Boolean] = OptDefault,
disableAnimation : OptionalParam[Boolean] = OptDefault,
shrink : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
focused : OptionalParam[Boolean] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTextFieldLabelComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTextFieldLabelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTextFieldLabelComponent.type](
      MuiTextFieldLabelComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTextFieldLabelC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTextFieldLabelComponent.type](
      MuiTextFieldLabelComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
