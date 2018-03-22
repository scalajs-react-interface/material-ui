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
 @JSImport("material-ui/TextField",JSImport.Default)
object MuiTextFieldComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTextField {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
FormHelperTextProps : OptionalParam[js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
InputLabelProps : OptionalParam[js.Object] = OptDefault,
autoFocus : OptionalParam[Boolean] = OptDefault,
labelClassName : OptionalParam[String] = OptDefault,
defaultValue : OptionalParam[String] = OptDefault,
label : OptionalParam[ReactNode] = OptDefault,
rows : OptionalParam[String | Double | Int] = OptDefault,
helperText : OptionalParam[ReactNode] = OptDefault,
required : OptionalParam[Boolean] = OptDefault,
onChange : OptionalParam[(ReactEventI) => _] = OptDefault,
multiline : OptionalParam[Boolean] = OptDefault,
inputClassName : OptionalParam[String] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
helperTextClassName : OptionalParam[String] = OptDefault,
rowsMax : OptionalParam[String | Double | Int] = OptDefault,
rootRef : OptionalParam[js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
InputProps : OptionalParam[js.Object] = OptDefault,
InputClassName : OptionalParam[String] = OptDefault,
name : OptionalParam[String] = OptDefault,
autoComplete : OptionalParam[Boolean] = OptDefault,
placeholder : OptionalParam[String] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
value : OptionalParam[String | Double | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTextFieldComponent.type, Unit] = null): ReactElement { type Instance = MuiTextFieldComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTextFieldComponent.type](
      MuiTextFieldComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         
