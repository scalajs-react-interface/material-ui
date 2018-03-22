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
 @JSImport("material-ui/Input",JSImport.Default)
object MuiInputComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiInput {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
autoFocus : OptionalParam[Boolean] = OptDefault,
onBlur : OptionalParam[ReactEventI => _] = OptDefault,
rows : OptionalParam[String | Double | Int] = OptDefault,
onFocus : OptionalParam[ReactEventI => _] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
onKeyDown : OptionalParam[ReactEventI => _] = OptDefault,
multiline : OptionalParam[Boolean] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
onChange : OptionalParam[ReactEventI => _] = OptDefault,
rowsMax : OptionalParam[String | Double | Int] = OptDefault,
disableUnderline : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
onDirty : OptionalParam[ReactEventI => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
defaultValue : OptionalParam[String | Double | Int] = OptDefault,
onClean : OptionalParam[ReactEventI => _] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
onKeyUp : OptionalParam[ReactEventI => _] = OptDefault,
name : OptionalParam[String] = OptDefault,
autoComplete : OptionalParam[Boolean] = OptDefault,
placeholder : OptionalParam[String] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
value : OptionalParam[String | Double | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiInputComponent.type, Unit] = null): ReactElement { type Instance = MuiInputComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiInputComponent.type](
      MuiInputComponent,
      props,
      key,
      ref)
    }
 }

 
       
         


     

         
